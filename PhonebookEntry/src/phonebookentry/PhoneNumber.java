/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebookentry;

/**
 *
 * @author QueenB
 */
class PhoneNumber {

    public String phoneNumber;

    public PhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean equals(PhoneNumber other) {
        return this.phoneNumber.equals(other.phoneNumber);
    }

}
