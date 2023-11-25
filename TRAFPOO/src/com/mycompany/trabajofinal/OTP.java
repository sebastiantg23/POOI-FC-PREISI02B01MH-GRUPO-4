/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajofinal;

/**
 *
 * @author USER
 */
public class OTP {
    private int[] digits;
    private int digitCount;

    public OTP(int numberOfDigits) {
        digits = new int[numberOfDigits];
        digitCount = 0;
    }

    public boolean addDigit(int digit) {
        if (digitCount < digits.length && digit >= 0 && digit <= 9) {
            digits[digitCount] = digit;
            digitCount++;
            return true;
        }
        return false;
    }

    public String getOTP() {
        if (digitCount == digits.length) {
            StringBuilder otpBuilder = new StringBuilder();
            for (int i = 0; i < digitCount; i++) {
                otpBuilder.append(digits[i]);
            }
            return otpBuilder.toString();
        }
        return "Código OTP incompleto";
    }

    public void clear() {
        digitCount = 0;
    }

    public int getDigitCount() {
        return digitCount;
    }

    public int[] getDigits() {
        return digits;
    }

    public int getDigitAt(int position) {
        if (position >= 0 && position < digitCount) {
            return digits[position];
        }
        return -1; // Valor no válido
    }
}

