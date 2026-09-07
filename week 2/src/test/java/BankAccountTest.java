package org.zut;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
        public class BankAccountTest {
        @Test
          public void testBankAccount () {

            // Arrange - What do i need to test
            BankAccount account = new BankAccount();
            //Act - What's the action i want to check
            account.deposit(100);
            //assert - What must be true
                assertEquals(100, account.balance);
            }
        }