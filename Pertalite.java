package com.mycompany.gopertabetaversion2;

import java.util.Scanner;

public class Pertalite extends SPBU
{
    private BahanBakar tangkiPertalite;

    public Pertalite()
    {
        tangkiPertalite = new BahanBakar(7650, "Pertalite", 50, 1000);
    }

    @Override
    public BahanBakar getTangki()
    {
        return this.tangkiPertalite;
    }

    @Override
    public void isiMinyak(User user, int liter, int biaya)
    {
        tangkiPertalite.kurangi(liter);
        user.kurangi(biaya);
        pendapatan += biaya;
    }

    @Override
    public boolean cekIsiTangki(int liter)
    {
        return tangkiPertalite.getIsiTangki() >= liter;
    }

    @Override
    public boolean cekSaldoUser(int saldo)
    {
        return saldo >= tangkiPertalite.getHarga();
    }
}
