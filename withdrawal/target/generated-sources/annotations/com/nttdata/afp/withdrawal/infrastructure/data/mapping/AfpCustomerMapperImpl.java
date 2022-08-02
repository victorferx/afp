package com.nttdata.afp.withdrawal.infrastructure.data.mapping;

import com.nttdata.afp.withdrawal.domain.entities.AfpCustomerDto;
import com.nttdata.afp.withdrawal.infrastructure.data.entities.AfpCustomer;
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
public class AfpCustomerMapperImpl implements AfpCustomerMapper {

    @Override
    public AfpCustomer afpCustomerDtoToAfpCustomer(AfpCustomerDto afpCustomerDto) {
        if ( afpCustomerDto == null ) {
            return null;
        }

        AfpCustomer.AfpCustomerBuilder afpCustomer = AfpCustomer.builder();

        afpCustomer.id( afpCustomerDto.getId() );
        afpCustomer.identityCard( afpCustomerDto.getIdentityCard() );
        afpCustomer.amount( afpCustomerDto.getAmount() );
        afpCustomer.depositDate( afpCustomerDto.getDepositDate() );
        afpCustomer.bankAccount( afpCustomerDto.getBankAccount() );
        afpCustomer.afpId( afpCustomerDto.getAfpId() );

        return afpCustomer.build();
    }

    @Override
    public AfpCustomerDto afpCustomerToAfpCustomerDto(AfpCustomer afpCustomer) {
        if ( afpCustomer == null ) {
            return null;
        }

        AfpCustomerDto afpCustomerDto = new AfpCustomerDto();

        afpCustomerDto.setId( afpCustomer.getId() );
        afpCustomerDto.setIdentityCard( afpCustomer.getIdentityCard() );
        afpCustomerDto.setAmount( afpCustomer.getAmount() );
        afpCustomerDto.setDepositDate( afpCustomer.getDepositDate() );
        afpCustomerDto.setBankAccount( afpCustomer.getBankAccount() );
        afpCustomerDto.setAfpId( afpCustomer.getAfpId() );

        return afpCustomerDto;
    }

    @Override
    public List<AfpCustomerDto> afpCustomersToAfpCustomerDtos(List<AfpCustomer> afpCustomers) {
        if ( afpCustomers == null ) {
            return null;
        }

        List<AfpCustomerDto> list = new ArrayList<AfpCustomerDto>( afpCustomers.size() );
        for ( AfpCustomer afpCustomer : afpCustomers ) {
            list.add( afpCustomerToAfpCustomerDto( afpCustomer ) );
        }

        return list;
    }

    @Override
    public void update(AfpCustomer afpCustomer, AfpCustomerDto afpCustomerDto) {
        if ( afpCustomerDto == null ) {
            return;
        }

        afpCustomer.setIdentityCard( afpCustomerDto.getIdentityCard() );
        afpCustomer.setAmount( afpCustomerDto.getAmount() );
        afpCustomer.setDepositDate( afpCustomerDto.getDepositDate() );
        afpCustomer.setBankAccount( afpCustomerDto.getBankAccount() );
        afpCustomer.setAfpId( afpCustomerDto.getAfpId() );
    }
}
