module com.example.java_29_comparsa_di_nuova_scritta_tamite_bottone {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java_29_comparsa_di_nuova_scritta_tramite_bottone to javafx.fxml;
    exports com.example.java_29_comparsa_di_nuova_scritta_tramite_bottone;
}