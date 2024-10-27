import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("donnez n :");
        int n = sn.nextInt();
        float[] notes = new float[n];
        for (int i = 0; i < n; i++) {
            notes[i] = sn.nextFloat();
        }
        GererNotes notesgerer= new GererNotes();
        notesgerer.TrierEtAfficher(notes);
        notesgerer.AfficherNotesMoyenne(notes);
        notesgerer.MaxMinNotes(notes);
        System.out.println("entrer une notes");
        float noteRechercher= sn.nextFloat();
        notesgerer.NbreEtudiants(notes,noteRechercher);

    }
}
