package com.nttdata.afp.withdrawal.infrastructure.data.mapping;

import com.nttdata.afp.withdrawal.domain.entities.AfpDto;
import com.nttdata.afp.withdrawal.infrastructure.data.entities.Afp;
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
public class AfpMapperImpl implements AfpMapper {

    @Override
    public Afp afpDtoToAfp(AfpDto afpDto) {
        if ( afpDto == null ) {
            return null;
        }

        Afp.AfpBuilder afp = Afp.builder();

        afp.id( afpDto.getId() );
        afp.name( afpDto.getName() );

        return afp.build();
    }

    @Override
    public AfpDto afpToAfpDto(Afp afp) {
        if ( afp == null ) {
            return null;
        }

        AfpDto afpDto = new AfpDto();

        afpDto.setId( afp.getId() );
        afpDto.setName( afp.getName() );

        return afpDto;
    }

    @Override
    public List<AfpDto> afpsToAfpDtos(List<Afp> afps) {
        if ( afps == null ) {
            return null;
        }

        List<AfpDto> list = new ArrayList<AfpDto>( afps.size() );
        for ( Afp afp : afps ) {
            list.add( afpToAfpDto( afp ) );
        }

        return list;
    }

    @Override
    public void update(Afp afp, AfpDto afpDto) {
        if ( afpDto == null ) {
            return;
        }

        afp.setName( afpDto.getName() );
    }
}
