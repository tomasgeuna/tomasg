/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriajpa.servicios;

import java.util.List;
import libreriajpa.entidades.Editor;
import libreriajpa.entidades.dao.EditorDao;

/**
 *
 * @author tomas
 */
public class EditorServicio {
    private EditorDao editorDao = new EditorDao();
    
    public Editor crearEditor(Editor editor) {
        return editorDao.crearEditor(editor);
    }

    public List<Editor> findAll() {
        List<Editor> editor = editorDao.FindAll();
        mostrarLista(editor);
        return editor;
    }

    public void modificarEditor(Editor editor) throws Exception {
        if (editorDao.findByID(editor) == null) {
            throw new Exception("No existe la editorial en la base de datos");
        }
        editorDao.modificarEditor(editor);
    }

    public void eliminarEditor(Editor editor) {
        editorDao.eliminarEditor(editor);
    }

    private void mostrarLista(List<Editor> editor) {
        for (Editor editor1 : editor) {
            System.out.println(editor1.toString());
        }
    }
}
