package com.mifos.core.data.repository

import com.mifos.core.data.GroupLoanPayload
import com.mifos.core.objects.accounts.loan.Loans
import com.mifos.core.objects.templates.loans.GroupLoanTemplate
import rx.Observable

/**
 * Created by Aditya Gupta on 12/08/23.
 */
interface GroupLoanAccountRepository {

    fun getGroupLoansAccountTemplate(groupId: Int, productId: Int): Observable<GroupLoanTemplate>

    fun createGroupLoansAccount(loansPayload: GroupLoanPayload): Observable<Loans>
}