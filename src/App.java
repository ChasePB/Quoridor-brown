
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class App {

    private boolean RowPressed;
    private boolean columnPressed;
    private JButton cButton;
    private JPanel panelMain;
    private JButton bButton;
    private JButton AButton;
    private JButton dButton;
    private JButton eButton;
    private JButton fButton;
    private JButton gButton;
    private JButton hButton;
    private JButton WallButton;
    private JButton movePlayerButton;
    private JTextField player1TextField;
    private JButton row1Button;
    private JButton row2Button;
    private JButton row3Button;
    private JButton row4Button;
    private JButton row5Button;
    private JButton row6Button;
    private JButton row7Button;
    private JButton row8Button;
    private JButton iButton;
    private JButton row9Button;
    private JButton northButton;
    private JButton southButton;
    private JButton eastButton;
    private JButton westButton;
    private JButton upButton;
    private JButton downButton1;
    private JButton leftButton1;
    private JButton rightButton1;
    private JTextField player2TextField;
    private JButton bButton2;
    private JButton AButton2;
    private JButton WallButton2;
    private JButton row1Button2;
    private JButton northButton2;
    private JButton southButton2;
    private JButton eastButton2;
    private JButton westButton2;
    private JButton cButton2;
    private JButton dButton2;
    private JButton eButton2;
    private JButton fButton2;
    private JButton gButton2;
    private JButton hButton2;
    private JButton iButton2;
    private JButton row9Button2;
    private JButton row8Button2;
    private JButton row7Button2;
    private JButton row6Button2;
    private JButton row5Button2;
    private JButton row4Button2;
    private JButton row3Button2;
    private JButton row2Button2;
    private JButton upButton2;
    private JButton downButton2;
    private JButton leftButton2;
    private JButton rightButton2;
    private JButton movePlayerButton2;
    private JPanel panelMain4;
    private int deltaX = 100;
    private int deltaY = 75;
    private int turnStatus = 1;
    private boolean playerMoved = false;


    public static void GUISetUp2() throws Exception {


        JFrame frame = new JFrame("Quoridor Controls GUI");   //Message on top of the simulation screen
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Close operation
        App GUI = new App();
        frame.setSize(1000, 1000);                           //Sets the Simulation frame size
        frame.setContentPane(GUI.panelMain);                       //Creates content pane of GUI
        frame.setAlwaysOnTop(true);                                     //Places the GUI on top of the screen over the Simulation
        frame.setVisible(true);


        //Allows user to see the GUI


    }


    private App() throws Exception {
        GameSetup gs = new GameSetup();


        if (turnStatus == 1) {

            if (movePlayerButton != null) {
                movePlayerButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        upButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                gs.player1Y -= deltaY;
                                gs.drawBoard();
                                gs.drawPlayer(2);

                                turnStatus = 2;


                            }
                        });

                        downButton1.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                gs.player1Y += deltaY;
                                gs.drawBoard();
                                gs.drawPlayer(2);
                                turnStatus = 2;
                                playerMoved = true;

                            }
                        });
                        leftButton1.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                gs.player1X -= deltaX;
                                gs.drawBoard();
                                gs.drawPlayer(2);
                                turnStatus = 2;

                            }
                        });
                        rightButton1.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                gs.player1X += deltaX;
                                gs.drawBoard();
                                gs.drawPlayer(2);
                                turnStatus = 2;


                            }
                        });
                    }
                });
            }
            WallButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    AButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                        }
                    });
                    bButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                        }
                    });
                    cButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                        }
                    });
                    dButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                        }


                    });
                    eButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                        }
                    });
                    fButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                        }
                    });
                    gButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                        }
                    });
                    hButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                        }
                    });
                    iButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                        }
                    });
                    if (columnPressed == true) {
                        row1Button.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                            }
                        });
                        row2Button.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                            }
                        });
                        row3Button.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                            }
                        });
                        row4Button.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                            }
                        });
                        row5Button.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                            }
                        });
                        row6Button.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                            }
                        });
                        row7Button.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                            }
                        });
                        row8Button.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                            }
                        });
                        row9Button.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                            }
                        });
                    }

                    if (RowPressed == true) {
                        northButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                            }
                        });
                        southButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                            }
                        });
                        eastButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                            }
                        });
                        westButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                            }
                        });


                    }
                }
            });


        }




        else{
        movePlayerButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                upButton2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        gs.player2Y -= deltaY;
                        gs.drawBoard();
                        gs.drawPlayer(2);
                        turnStatus = 1;


                    }
                });

                downButton2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        gs.player2Y += deltaY;
                        gs.drawBoard();
                        gs.drawPlayer(2);
                        turnStatus = 1;

                    }
                });
                leftButton2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        gs.player2X -= deltaX;
                        gs.drawBoard();
                        gs.drawPlayer(2);
                        turnStatus = 1;


                    }
                });
                rightButton2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        gs.player2X += deltaX;
                        gs.drawBoard();
                        gs.drawPlayer(2);
                        ;
                        turnStatus = 1;

                    }
                });
            }
        });


        WallButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AButton2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                    }
                });
                bButton2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                    }
                });
                cButton2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                    }
                });
                dButton2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                    }


                });
                eButton2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                    }
                });
                fButton2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                    }
                });
                gButton2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                    }
                });
                hButton2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                    }
                });
                iButton2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                    }
                });
                if (columnPressed == true) {
                    row1Button2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                        }
                    });
                    row2Button2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                        }
                    });
                    row3Button2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                        }
                    });
                    row4Button2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                        }
                    });
                    row5Button2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                        }
                    });
                    row6Button2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                        }
                    });
                    row7Button2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                        }
                    });
                    row8Button2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                        }
                    });
                    row9Button2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                        }
                    });
                }
                if (RowPressed == true) {
                    northButton2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                        }
                    });
                    southButton2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                        }
                    });
                    eastButton2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                        }
                    });
                    westButton2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                        }
                    });


                }
            }
        });


    }

    }
}





