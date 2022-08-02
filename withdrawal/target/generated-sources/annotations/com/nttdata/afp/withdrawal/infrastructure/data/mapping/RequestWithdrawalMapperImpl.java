package com.nttdata.afp.withdrawal.infrastructure.data.mapping;

import com.nttdata.afp.withdrawal.domain.entities.RequestWithdrawalDto;
import com.nttdata.afp.withdrawal.infrastructure.data.entities.RequestWithdrawal;
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
public class RequestWithdrawalMapperImpl implements RequestWithdrawalMapper {

    @Override
    public RequestWithdrawal requestWithdrawalDtoToRequestWithdrawal(RequestWithdrawalDto requestWithdrawalDto) {
        if ( requestWithdrawalDto == null ) {
            return null;
        }

        RequestWithdrawal.RequestWithdrawalBuilder requestWithdrawal = RequestWithdrawal.builder();

        requestWithdrawal.id( requestWithdrawalDto.getId() );
        requestWithdrawal.identityCard( requestWithdrawalDto.getIdentityCard() );
        requestWithdrawal.amount( requestWithdrawalDto.getAmount() );
        requestWithdrawal.afpId( requestWithdrawalDto.getAfpId() );

        return requestWithdrawal.build();
    }

    @Override
    public RequestWithdrawalDto requestWithdrawalToRequestWithdrawalDto(RequestWithdrawal requestWithdrawal) {
        if ( requestWithdrawal == null ) {
            return null;
        }

        RequestWithdrawalDto requestWithdrawalDto = new RequestWithdrawalDto();

        requestWithdrawalDto.setId( requestWithdrawal.getId() );
        requestWithdrawalDto.setIdentityCard( requestWithdrawal.getIdentityCard() );
        requestWithdrawalDto.setAmount( requestWithdrawal.getAmount() );
        requestWithdrawalDto.setAfpId( requestWithdrawal.getAfpId() );

        return requestWithdrawalDto;
    }

    @Override
    public List<RequestWithdrawalDto> requestWithdrawalsToRequestWithdrawalDtos(List<RequestWithdrawal> requestWithdrawals) {
        if ( requestWithdrawals == null ) {
            return null;
        }

        List<RequestWithdrawalDto> list = new ArrayList<RequestWithdrawalDto>( requestWithdrawals.size() );
        for ( RequestWithdrawal requestWithdrawal : requestWithdrawals ) {
            list.add( requestWithdrawalToRequestWithdrawalDto( requestWithdrawal ) );
        }

        return list;
    }

    @Override
    public void update(RequestWithdrawal requestWithdrawal, RequestWithdrawalDto requestWithdrawalDto) {
        if ( requestWithdrawalDto == null ) {
            return;
        }

        requestWithdrawal.setIdentityCard( requestWithdrawalDto.getIdentityCard() );
        requestWithdrawal.setAmount( requestWithdrawalDto.getAmount() );
        requestWithdrawal.setAfpId( requestWithdrawalDto.getAfpId() );
    }
}
