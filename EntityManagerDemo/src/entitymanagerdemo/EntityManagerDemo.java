/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entitymanagerdemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import Model.Address;
import Model.Customer;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author sarun
 */
public class EntityManagerDemo {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        createData();
        printAllCustomer();
        printCustomerByCity("Bangkok");

    }

    public static void createData() {
        Customer customer = new Customer();
        Address address = new Address();

        customer.setId(1L);
        address.setId(1L);

        address.setCountry("TH");
        address.setZipcode("10900");
        address.setCity("Bangkok");
        address.setStreet("123/4 Viphavadee Rd.");
        customer.setLastname("Henry");
        customer.setFirstname("John");
        customer.setEmail("jh@mail.com");
        customer.setAddressId(address);
        address.setCustomerFk(customer);
        /////////////////////////////////////////////

        Customer customer2 = new Customer();
        Address address2 = new Address();

        customer2.setId(2L);
        address2.setId(2L);

        address2.setCountry("TH");
        address2.setZipcode("10900");
        address2.setCity("Bangkok");
        address2.setStreet("123/5 Viphavadee Rd.");
        customer2.setLastname("Jane");
        customer2.setFirstname("Marry");
        customer2.setEmail("mj@mail.com");
        customer2.setAddressId(address2);
        address2.setCustomerFk(customer2);
        /////////////////////////////////////////////

        Customer customer3 = new Customer();
        Address address3 = new Address();

        customer3.setId(3L);
        address3.setId(3L);

        address3.setCountry("TH");
        address3.setZipcode("20900");
        address3.setCity("Nonthaburi");
        address3.setStreet("543/21 Fake Rd.");
        customer3.setLastname("Parker");
        customer3.setFirstname("Peter");
        customer3.setEmail("pp@mail.com");
        customer3.setAddressId(address3);
        address3.setCustomerFk(customer3);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityManagerDemoPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {

            em.persist(address);
            em.persist(customer);
            em.persist(address2);
            em.persist(customer2);
            em.persist(address3);
            em.persist(customer3);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

    }

    public static void printAllCustomer() {

        List<Customer> list = findAllCustomer();

        try {
            for (int i = 0; i < list.size(); i++) {
                String id = String.valueOf(list.get(i).getId());
                String name = list.get(i).getFirstname();
                String lastname = list.get(i).getLastname();
                String email = list.get(i).getEmail();
                String street = list.get(i).getAddressId().getStreet();
                String city = list.get(i).getAddressId().getCity();
                String country = list.get(i).getAddressId().getCountry();
                String zipcode = list.get(i).getAddressId().getZipcode();

                System.out.println("First Name:" + name);
                System.out.println("Last Name:" + lastname);
                System.out.println("Email:" + email);
                System.out.println("Street:" + street);
                System.out.println("City:" + city);
                System.out.println("Country:" + country);
                System.out.println("Zip Code:" + zipcode);

                System.out.println("-------------------------------");
            }
        } catch (Exception ex) {

        }
    }

    public static void printCustomerByCity(String City) {
        List<Customer> list = findCustomerByCity(City);

        try {
            for (int i = 0; i < list.size(); i++) {
                String id = String.valueOf(list.get(i).getId());
                String name = list.get(i).getFirstname();
                String lastname = list.get(i).getLastname();
                String email = list.get(i).getEmail();
                String street = list.get(i).getAddressId().getStreet();
                String city = list.get(i).getAddressId().getCity();
                String country = list.get(i).getAddressId().getCountry();
                String zipcode = list.get(i).getAddressId().getZipcode();

                System.out.println("First Name:" + name);
                System.out.println("Last Name:" + lastname);
                System.out.println("Email:" + email);
                System.out.println("Street:" + street);
                System.out.println("City:" + city);
                System.out.println("Country:" + country);
                System.out.println("Zip Code:" + zipcode);

                System.out.println("-------------------------------");
            }
        } catch (Exception ex) {

        }
    }

    public static List<Customer> findAllCustomer() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityManagerDemoPU");
        EntityManager em = emf.createEntityManager();
        List<Customer> CustomerList = (List<Customer>) em.createNamedQuery("Customer.findAll").getResultList();
        em.close();
        return CustomerList;
    }

    public static List<Customer> findCustomerByCity(String city) {
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityManagerDemoPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT c FROM Customer c WHERE c.addressId.city = :city");
        q.setParameter("city", city);
        List<Customer> CustomerList = (List<Customer>) q.getResultList();
        return CustomerList;
    }

    public void persist(Object object) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityManagerDemoPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
}
