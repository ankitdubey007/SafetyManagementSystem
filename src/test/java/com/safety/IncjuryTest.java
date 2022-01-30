//package com.safety;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.Assert.assertNotNull;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.when;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.safety.Model.Incident;
//import com.safety.Model.Injury;
//import com.safety.Repository.IncidentRepository;
//import com.safety.Repository.InjuryRepository;
//import com.safety.Service.IncidentService;
//import com.safety.Service.InjuryService;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class IncjuryTest {
////     
//////	@Autowired
//////	InjuryService service;
//////	
//////	@MockBean
//////	InjuryRepository repo;
////	
////
//////	@Test
//////	public void addInjuryTest() {
//////		when(repo.save(null)).thenReturn(Stream.of(new Injury(10,"burnt",2),new Injury(325,
//////				"alska",1)).collect(Collectors.toList()));
//////		assertEquals(2, service.addInjury(null));
//////		 
//////	}
//////	
//////	@Test
//////	public void fetchAllInjuryTest() {
//////		when(repo.findAll()).thenReturn(Stream.of(new Injury(1, "ala", 2)).collect(Collectors.toList()));
//////		assertEquals(2,service.findallInjury().size());
//////	}
////////	
//////	
////////	fetch by id
//////	
////
//////	@Test
//////	void contextLoads() {
//////	}
//////
//////	@Test
//////	public void fetchAllInjuryTest() {
//////		when(repo.findAll()).thenReturn
//////			(Stream.of(new Injury(1, "burnt", 2, 70)).collect(Collectors.toList()));
//////
//////		assertEquals(1, service.findallInjury().size());
//////
//////	}
//////	
//////	@Test
//////	public void  addInjuryTest() {
////////		Injury injury;
//////		when(repo.save(null)).thenReturn
//////		(Stream.of(new Injury(1, "burnt", 2, 70)).collect(Collectors.toList()));
//////		assertEquals(1, service.addInjury(null));
//////	}
//////	
//////}
////
//@Autowired
//private InjuryService service;
//
//@MockBean
//private InjuryRepository repository;
//
////fetchAllInjury
//
//@Test
// public void getInjuryAddTest() {
//	when(repository.findAll()).thenReturn
//			(Stream.of( new Injury(1, "burnt", 2, 70)).collect(Collectors.toList()));       
//	assertEquals(1,service.findallInjury().size());
//}
//
////addInjury
//
//@Test
//public void saveInjury() {
//	Injury injury=new Injury(1, "burnt", 2, 70);
//	when(repository.save(injury)).thenReturn(injury);
//	assertEquals(injury,service.addInjury(injury));
//}
////
//}
//
