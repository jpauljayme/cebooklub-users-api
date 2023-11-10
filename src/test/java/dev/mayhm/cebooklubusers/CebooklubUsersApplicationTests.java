package dev.mayhm.cebooklubusers;

import dev.mayhm.cebooklubusers.entity.CebooklubUser;
import dev.mayhm.cebooklubusers.repository.CebooklubUserRepository;
import dev.mayhm.cebooklubusers.service.CebooklubUserServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class CebooklubUsersApplicationTests {
	CebooklubUserServiceImpl cebooklubUserService;

	@Mock
	CebooklubUserRepository cebooklubUserRepository;

	@BeforeEach
	void init(){
		cebooklubUserService = new CebooklubUserServiceImpl(cebooklubUserRepository);
	}

	@Test
	void whenGetUserByUsernameAndPasswordReturnUser() {
		CebooklubUser expectedUser = new CebooklubUser("Decelle Suarez",
				"decelle.dummy@icloud.com",
				"decelle",
				"password",
				"admin"
				);

		Optional<CebooklubUser> actualUser = cebooklubUserService
				.getUserByUsernameAndPassword( expectedUser.getUsername(),
						expectedUser.getPassword());

		Assertions.assertEquals(expectedUser,
				actualUser,
				"Should be equal");


	}

}
