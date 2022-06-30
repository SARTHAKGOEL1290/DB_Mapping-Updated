package com.DB_Mapping;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.DB_Mapping.DTO.Bankdto;
import com.DB_Mapping.Entity.Bank;
import com.DB_Mapping.Entity.UserDetail;
import com.DB_Mapping.Entity.Users;
import com.DB_Mapping.Repository.BankRepository;
import com.DB_Mapping.Repository.UserDetailRepository;
import com.DB_Mapping.Repository.UsersRepository;

@SpringBootApplication
public class DbMappingApplication implements CommandLineRunner {

	@Autowired
	UserDetailRepository detailRepo;
	
	@Autowired
	UsersRepository userRepo;
	
	@Autowired
	BankRepository bankRepo;
	
	
	@Override
	@Transactional
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	/*	
		Users user = new Users();
		user.setName("sarthak");
		user.setEmail("sart1290@gmail.com");
		
		
		Bank bank1 = new Bank("sbi","sec-10");
		Bank bank2 = new Bank("pnb","sec-11");
		Bank bank3 = new Bank("hdfc","sec-12");
		
		List<Bank> lis = new ArrayList<>();
		lis.add(bank1);
		lis.add(bank2);
		lis.add(bank3);
		
	//	bankRepo.save(bank1);
		
		UserDetail userdetail = new UserDetail();
		
		userdetail.setAddress("main complex");
		userdetail.setCity("noida");
		
		userdetail.setBankdetail(lis);
		
		userdetail.setUser(user);
		user.setUserdetail(userdetail);
		
		
		userRepo.save(user);
		
		System.out.println(detailRepo.getBankDtoInfo(33));
		List<Bankdto> list = detailRepo.getBankDtoInfo(37);
	  //	 list.stream().filter(i->i.getCity().equals("noida")).forEach(System.out::println);
		//System.out.println(list.stream().filter(i->i.getCity().equals("noida")).count());
		
		//sorting the list based on name 
		List<Bankdto> lis2 = list.stream().filter(i->i.getCity().equals("noida")).collect(Collectors.toList());
			  lis2.stream().sorted(Comparator.comparing(Bankdto::getBname)).forEach(System.out::println);		
		
			// this is used for null pointer exception
		/*list.stream().filter(i->i.getCity().equals("noida")).
			  findAny().orElseThrow(()-> new NullPointerException("value not present")));
		*/
		
		//userRepo.getDeleteById(5);
		//detailRepo.getDeleteByUDId(29);
	//	bankRepo.getDeleteByBId(32);
		
		detailRepo.getUpdateByUDId("gurugram",33);
		System.out.println("->>>>>>>>>>>>>>>>>>>>>deleted");
		
		System.out.println(detailRepo.getBankDtoInfo(37));
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DbMappingApplication.class, args);
	}

	

}
