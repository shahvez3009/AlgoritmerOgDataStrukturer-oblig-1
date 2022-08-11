package no.oslomet.cs.algdat.Oblig1;

////// Løsningsforslag Oblig 1 ////////////////////////

import java.lang.UnsupportedOperationException;

import java.util.Arrays;
import java.util.NoSuchElementException;


public class Oblig1 {
    private Oblig1() {}

    ///// Oppgave 1 //////////////////////////////////////
    public static int maks(int[] a) {
        if (a.length<1) throw new NoSuchElementException("Arrayet er tomt");
      for(int i=0; i<a.length-1; i++)
            if (a[i] > a[i + 1]) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
        }
        return a[a.length - 1];
    }

    public static int ombyttinger(int[] a) {
        if (a.length<1)
        throw new UnsupportedOperationException("Arrayet er tomt");
        int antall =0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
                antall++;  // inversjon = true
            }
        }
        return antall;
    }


    ///// Oppgave 2 //////////////////////////////////////   
public static int antallUlikeSortert(int[] a) {
    if (a.length<1){return 0;}
        for(int i=0; i<a.length-1; i++){
            if(a[i]>a[i+1])
                throw new IllegalStateException("Arrayet er ikke sortet");
        }
        int verdier= 1;
        for (int j=0; j<a.length-1; j++){
            if (a[j+1]>a[j])
                verdier++;
        }
        return verdier;
    }

    ///// Oppgave 3 //////////////////////////////////////
    public static int antallUlikeUsortert(int[] a) {
       
        if (a.length < 1) {
            return 0;
        }
        // initialiserer at det er 1 variant i array
        int ulike = 0;

        if (a.length == 1) {
            return 1;
        }
        for (int i = 0; i < a.length; i++) {
            int j;

            for (j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    break;
                }
            }
            if (i == j) {
                ulike++;
            }


        }
        return ulike;
    }


    ///// Oppgave 4 //////////////////////////////////////


    public static void bytt(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static int partisjonering(int[] a, int v, int h, int skilleverdi) {
        while (true) {                                  // stopper når v > h
            while
            (v <= h && a[v] < skilleverdi) v++;   // h er stoppverdi for v
            while
            (v <= h && a[h] >= skilleverdi) h--;  // v er stoppverdi for h

            if (v < h) {
                bytt(a,v++,h--);                 // bytter om a[v] og a[h]
            } else
                return v;                     // a[v] er nåden første som ikke er mindre enn skilleverdi
        }
    }
    public static int byttePartisjonering(int[] a, int v, int h, int indeks) {
        bytt(a, indeks, h);
        int pos = partisjonering(a, v, h - 1, a[h]);
        bytt(a, pos, h);
        return pos;
    }

    public static void kvikkSortering(int[] a, int v, int h) {
        if (v >= h) return;
        int k = byttePartisjonering(a, v, h, (v + h)/2);
        kvikkSortering(a, v, k - 1);
        kvikkSortering(a, k + 1, h);
    }
    public static void delsortering(int[] a) {
        int oddeTall = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                int temp = a[i];
                a[i] = a[oddeTall];
                a[oddeTall] = temp;
                oddeTall++;
            }
        }
        kvikkSortering(a, 0, oddeTall - 1);
        kvikkSortering(a, oddeTall, a.length-1);

    }

    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {
        int l= a.length-1;
        if (l<1) return;

        char temp= a[l];
        for (int m=l; m>0; m--){a[m]=a[m-1];}
        a[0]=temp;
    }

    ///// Oppgave 6 //////////////////////////////////////
    public static void rotasjon(char[] a, int k) {
        int l= a.length;
        if (l<2) return;
        if((k %= l) < 0) {k = k + l;}

        char [] copy= Arrays.copyOfRange(a,l-k,l);
        for (int i=l-1; i>=k; i--){a[i]=a[i-k];}
        System.arraycopy(copy,0,a,0,k);
    }

    ///// Oppgave 7 //////////////////////////////////////
    /// 7a)
    public static String flett(String s, String t) {

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        char[] c = new char[a.length + b.length];


        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            c[k++] = a[i++];
            c[k++] = b[j++];
        }
        while (i < a.length) c[k++] = a[i++];
        while (j < b.length) c[k++] = b[j++];
        return new String(c);
    }



    /// 7b)
  public static String flett(String... s) {
    
    
   
      int lString = 0;
      StringBuilder resultat = new StringBuilder();
      for (String item : s) {
          if (lString < item.length()) {
              lString = item.length();
          }
      }


      for(int i = 0; i < lString; i++){
          for (String value : s) {
              if (value.length() >= i + 1) {
                  resultat.append(value.charAt(i));
              }
          }
      } return String.valueOf(resultat);
  }



    ///// Oppgave 8 //////////////////////////////////////
    public static int[] indekssortering(int[] a) {

        int n = a.length;
        int [] indeks = new int[n];
        int temp= 0;
        for(int i = 0; i < a.length; i++) {
            indeks[i]= i;
        }
        for(int l = 0; l < n; l++) {
            for(int j = 1; j < (n-l); j++) {
                if(a[indeks[j-1]] > a[indeks[j]]){
            temp = indeks[j-1];
            indeks[j-1]= indeks[j];
            indeks[j]= temp;
            }
        } 
    } return indeks;

}


    ///// Oppgave 9 //////////////////////////////////////
    public static int[] tredjeMin(int[] a) {

        int n = a.length;
        if (n < 3) {
            throw new NoSuchElementException("Tabellen din har færre enn tre elementer");
        }

        int[] initMinste = indekssortering(new int[]{a[0], a[1], a[2]});

        int minstv = initMinste[0]; // index til minste verdi
        int nmv = initMinste[1]; // index til nest mindste verdi
        int nnmv = initMinste[2]; // index til tredje minste verdi

        if (a[nmv] < a[minstv]) {
            minstv = 1;
            nmv = 0;
        }
        if (a[nnmv] < a[nmv]) {
            nmv = 2;
            nnmv = 1;
        }
        if (a[nnmv] < a[minstv]) {
            minstv = 2;
            nnmv = 0;
        }

        int minverdi = a[minstv];
        int nestminverdi = a[nmv];
        int nestnestminverdi = a[nnmv];

        for (int i = 3; i < n; i++) {
            if (a[i] < minverdi) {
                nnmv = nmv;
                nmv = minstv;
                nestnestminverdi = nestminverdi; // ny nestminste verdi
                nestminverdi = minverdi; // ny minste verdi

                minstv = i;
                minverdi = a[i];

            } else if (a[i] < nestminverdi) {
                nnmv = nmv;
                nmv=i;
                nestnestminverdi = nestminverdi;
                nestminverdi=a[i];

            }else if (a[i]<nestnestminverdi){
                nnmv = i;
                nestnestminverdi = a[i];
            }
        }
        initMinste[0]=minstv;
        initMinste[1]=nmv;
        initMinste[2]=nnmv;
        return initMinste;
    }

    ///// Oppgave 10 //////////////////////////////////////
    public static int bokstavNr(char bokstav) {
        int nummer = bokstav; 
        return nummer; 
    }
    
    public static boolean inneholdt(String a, String b) {

        int[] array = new int[256]; 

        for(char x : b.toCharArray()){array[x] += 1;}
        for(char x : a.toCharArray()){
            if(array[x] >= 1) {
                array[x]--;
            } else {return false;}
        } return true; 

    }
    // Oblig1

}


    





