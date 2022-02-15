package org.tinylibrary.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.tinylibrary.data.LoanDto;
import org.tinylibrary.entity.Loan;

import java.util.List;

@Mapper
public interface LoanMapper {
    LoanMapper INSTANCE = Mappers.getMapper(LoanMapper.class);

    LoanDto loanToLoanDto(Loan loan);

    Loan loanDtoToLoan(LoanDto loanDto);

    List<LoanDto> loanListToLoanDtoList(List<Loan> loanList);

    List<Loan> loanDtoListToLoanList(List<LoanDto> loanDtoList);
}
