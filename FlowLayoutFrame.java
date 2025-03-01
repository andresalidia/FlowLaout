/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package flowlayoutframe;

import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class FlowLayoutFrame extends JFrame
{

    private final JButton leftJButton; // botao para configurar alinhamento a esquerda
    private final JButton centerJButton; // botao para configurar alinhamento centralizad
    private final JButton rightJButton; // botao para configurar alinhamento à direita
    private FlowLayout layout; // objeto de layout
    private Container container; // contêiner para configurar layout

    // configura GUI e registra listeners de botão
    public FlowLayoutFrame()
    {

        super( "FlowLayout Demo" );

        layout = new FlowLayout(); // cria FlowLayout
        container = getContentPane(); // obtem conteiner para layout
        setLayout( layout ); // configura o layout de frame

        // configura leftJButton e registra listener
        leftJButton = new JButton( "Left" ); // cria botão Left
        add( leftJButton ); // adiciona o botão Left ao frame
        leftJButton.addActionListener(
        new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                layout.setAlignment( FlowLayout.LEFT);
                // realinha os componentes anexado
                layout. layoutContainer( container );
            } // fim do metodo actionPerformed
        }
        ); // fim da chamada para addActionListener
        // configura centerJButton e registra o listener
        centerJButton = new JButton( "Center" ); // cria botão Center
        add( centerJButton ); // adiciona botão Center ao frame
        centerJButton.addActionListener(

            new ActionListener() // classe interna anônima
            {

                // processa evento centerJButton
                public void actionPerformed( ActionEvent event )
                {

                    layout.setAlignment( FlowLayout.CENTER);

                    // realinha os componentes anexados
                    layout.layoutContainer( container );
                } // fim do metodo actionPerformed
            } // fim da classe interna anônima
        ); // fim da chamada para addActionListener

        // configura rightJButton e registra o listener
        rightJButton = new JButton( "Right" ); // cria botao Right
        add( rightJButton ); // adiciona botão Right ao frame
        rightJButton.addActionListener(

            new ActionListener() // classe interna anônima
            {
                public void actionPerformed(ActionEvent event)
                {
                layout.setAlignment( FlowLayout.RIGHT);
                // realinha os componentes anexados
                layout.layoutContainer( container);
                } // fim do método actionPerformed
            } // fim da classe interna anônima
        ); // fim da chamada para addActionListener
    } // fim do construtor FlowLayoutFrame
} // FlowLayoutFrame fim da classe