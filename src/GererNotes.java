import java.util.Arrays;

public class GererNotes {


        public void TrierEtAfficher(float[] notes){
            Arrays.sort(notes);
            System.out.println("Notes triées : " + Arrays.toString(notes));
        }
        public void AfficherNotesMoyenne(float[] notes){
            float sum = 0;
            for (int i = 0; i < notes.length; i++){
                sum += notes[i];
            }
            float moyenne = sum / notes.length;
            System.out.println("Moyenne des notes : " + moyenne);
        }
        public void MaxMinNotes(float[] notes){
            float min = notes[0];
            float max = notes[0];
            for (int i = 0; i < notes.length; i++){
                if (notes[i] < min){
                    min = notes[i];
                }
                if (notes[i] > max){
                    max = notes[i];
                }
            }
            System.out.println("Notes max : " + max);
            System.out.println("Notes min : " + min);
        }
public void NbreEtudiants(float[] notes,float not){
            int nbre = 0;
            for (float c : notes){
                if (c == not){
                  nbre= nbre+1;
                }
            }
    System.out.println("Nombre d'étudiants ayant la note " + not + " : " + nbre);
}

    }

