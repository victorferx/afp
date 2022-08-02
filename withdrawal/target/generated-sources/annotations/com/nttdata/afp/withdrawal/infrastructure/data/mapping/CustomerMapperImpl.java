package com.nttdata.afp.withdrawal.infrastructure.data.mapping;

import com.nttdata.afp.withdrawal.domain.entities.CustomerDto;
import com.nttdata.afp.withdrawal.infrastructure.data.entities.Customer;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-01T22:31:41-0500",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 11.0.15 (Oracle Corporation)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public Customer customerDtoToCustomer(CustomerDto customerDto) {
        if ( customerDto == null ) {
            return null;
        }

        Customer.CustomerBuilder customer = Customer.builder();

        customer.id( customerDto.getId() );
        customer.identityCard( customerDto.getIdentityCard() );
        customer.name( customerDto.getName() );
        customer.lastName( customerDto.getLastName() );
        customer.phoneNumber( customerDto.getPhoneNumber() );
        customer.email( customerDto.getEmail() );

        return customer.build();
    }

    @Override
    public CustomerDto customerToCustomerDto(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerDto customerDto = new CustomerDto();

        customerDto.setId( customer.getId() );
        customerDto.setIdentityCard( customer.getIdentityCard() );
        customerDto.setName( customer.getName() );
        customerDto.setLastName( customer.getLastName() );
        customerDto.setPhoneNumber( customer.getPhoneNumber() );
        customerDto.setEmail( customer.getEmail() );

        return customerDto;
    }

    @Override
    public List<CustomerDto> customersToCustomerDtos(List<Customer> customers) {
        if ( customers == null ) {
            return null;
        }

        List<CustomerDto> list = new ArrayList<CustomerDto>( customers.size() );
        for ( Customer customer : customers ) {
            list.add( customerToCustomerDto( customer ) );
        }

        return list;
    }

    @Override
    public void update(Customer customer, CustomerDto customerDto) {
        if ( customerDto == null ) {
            return;
        }

        customer.setIdentityCard( customerDto.getIdentityCard() );
        customer.setName( customerDto.getName() );
        customer.setLastName( customerDto.getLastName() );
        customer.setPhoneNumber( customerDto.getPhoneNumber() );
        customer.setEmail( customerDto.getEmail() );
    }
}
