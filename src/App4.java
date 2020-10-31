import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App4 {

    private JPanel panelMain4;
    private JPanel PanelMainFour;
    private JButton columnAButton;
    private JButton bButton;
    private JButton cButton;
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
    private JButton movePlayerButton2;
    private JButton upButton2;
    private JButton downButton2;
    private JButton leftButton2;
    private JButton rightButton2;
    private JButton placeWallButton2;
    private JButton columnAButton2;
    private JButton bButton2;
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
    private JButton row1Button2;
    private JButton northButton2;
    private JButton southButton2;
    private JButton eastButton2;
    private JButton westButton2;
    private Container panelMainFour;
    private JButton columnAButton3;
    private JButton bButton3;
    private JButton cButton3;
    private JButton dButton3;
    private JButton eButton3;
    private JButton fButton3;
    private JButton gButton3;
    private JButton hButton3;
    private JButton placeWallButton3;
    private JButton iButton3;
    private JButton northButton3;
    private JButton southButton3;
    private JButton eastButton3;
    private JButton westButton3;
    private JButton upButton3;
    private JButton downButton3;
    private JButton leftButton3;
    private JButton movePlayerButton4;
    private JButton upButton4;
    private JButton downButton4;
    private JButton leftButton4;
    private JButton rightButton4;
    private JButton placeWallButton4;
    private JButton columnAButton4;
    private JButton bButton4;
    private JButton cButton4;
    private JButton dButton4;
    private JButton eButton4;
    private JButton fButton4;
    private JButton gButton4;
    private JButton hButton4;
    private JButton iButton4;
    private JButton northButton4;
    private JButton southButton4;
    private JButton eastButton4;
    private JButton westButton4;
    private JButton row1Button3;
    private JButton row1Button4;
    private JButton row2Button3;
    private JButton row2Button4;
    private JButton row3Button4;
    private JButton row3Button3;
    private JButton row4Button3;
    private JButton row4Button4;
    private JButton row5Button4;
    private JButton row5Button3;
    private JButton row6Button4;
    private JButton row6Button3;
    private JButton row7Button3;
    private JButton row7Buttton4;
    private JButton row8Button4;
    private JButton row8Button3;
    private JButton row9Button3;
    private JButton row9Button4;
    private JButton movePlayerButton3;
    private JButton rightButton3;

    public static void GUISetUp4() throws Exception {


        JFrame frame2 = new JFrame("Quoridor Controls GUI");   //Message on top of the simulation screen
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Close operation
        App4 GUI2 = new App4();
        frame2.setSize(2000, 1080);                           //Sets the Simulation frame size
        frame2.setContentPane(GUI2.panelMainFour);                  //Creates content pane of GUI
        frame2.setAlwaysOnTop(true);                                     //Places the GUI on top of the screen over the Simulation
        frame2.setVisible(true);

    }

    private App4() throws Exception{

//        int turnStatus = 1;
//        if (turnStatus == 1) {
//
//            if (movePlayerButton != null) {
//                movePlayerButton.addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//
//                        upButton.addActionListener(new ActionListener() {
//                            @Override
//                            public void actionPerformed(ActionEvent e) {
//                                y = 50;
//                                //drawPlayerOne(x, y);
//
//
//                            }
//                        });
//
//                        downButton1.addActionListener(new ActionListener() {
//                            @Override
//                            public void actionPerformed(ActionEvent e) {
//                                y -= 50;
//                                //drawPlayerOne(x, y);
//                            }
//                        });
//                        leftButton1.addActionListener(new ActionListener() {
//                            @Override
//                            public void actionPerformed(ActionEvent e) {
//                                x -= 50;
//                                //drawPlayerOne(x, y);
//                            }
//                        });
//                        rightButton1.addActionListener(new ActionListener() {
//                            @Override
//                            public void actionPerformed(ActionEvent e) {
//                                x += 50;
//                                //drawPlayerOne(x, y);
//
//                            }
//                        });
//                    }
//                });
//            }
//
//
//            WallButton.addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    AButton.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//
//                        }
//                    });
//                    bButton.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//
//                        }
//                    });
//                    cButton.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//
//                        }
//                    });
//                    dButton.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//
//                        }
//
//
//                    });
//                    eButton.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//
//                        }
//                    });
//                    fButton.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//
//                        }
//                    });
//                    gButton.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//
//                        }
//                    });
//                    hButton.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//
//                        }
//                    });
//                    iButton.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//
//                        }
//                    });
//                    if (columnPressed == true) {
//                        row1Button.addActionListener(new ActionListener() {
//                            @Override
//                            public void actionPerformed(ActionEvent e) {
//
//                            }
//                        });
//                        row2Button.addActionListener(new ActionListener() {
//                            @Override
//                            public void actionPerformed(ActionEvent e) {
//
//                            }
//                        });
//                        row3Button.addActionListener(new ActionListener() {
//                            @Override
//                            public void actionPerformed(ActionEvent e) {
//
//                            }
//                        });
//                        row4Button.addActionListener(new ActionListener() {
//                            @Override
//                            public void actionPerformed(ActionEvent e) {
//
//                            }
//                        });
//                        row5Button.addActionListener(new ActionListener() {
//                            @Override
//                            public void actionPerformed(ActionEvent e) {
//
//                            }
//                        });
//                        row6Button.addActionListener(new ActionListener() {
//                            @Override
//                            public void actionPerformed(ActionEvent e) {
//
//                            }
//                        });
//                        row7Button.addActionListener(new ActionListener() {
//                            @Override
//                            public void actionPerformed(ActionEvent e) {
//
//                            }
//                        });
//                        row8Button.addActionListener(new ActionListener() {
//                            @Override
//                            public void actionPerformed(ActionEvent e) {
//
//                            }
//                        });
//                        row9Button.addActionListener(new ActionListener() {
//                            @Override
//                            public void actionPerformed(ActionEvent e) {
//
//                            }
//                        });
//                    }
//
//                    if (RowPressed == true) {
//                        northButton.addActionListener(new ActionListener() {
//                            @Override
//                            public void actionPerformed(ActionEvent e) {
//
//                            }
//                        });
//                        southButton.addActionListener(new ActionListener() {
//                            @Override
//                            public void actionPerformed(ActionEvent e) {
//
//                            }
//                        });
//                        eastButton.addActionListener(new ActionListener() {
//                            @Override
//                            public void actionPerformed(ActionEvent e) {
//
//                            }
//                        });
//                        westButton.addActionListener(new ActionListener() {
//                            @Override
//                            public void actionPerformed(ActionEvent e) {
//
//                            }
//                        });
//
//
//                    }
//                }
//            });
//
//
//        } else if (turnStatus==2) {
//            movePlayerButton2.addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//
//                    upButton2.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//                            y += 50;
//                            //drawPlayerOne(x, y);
//
//
//                        }
//                    });
//
//                    downButton2.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//                            y -= 50;
//                            //drawPlayerOne(x, y);
//                        }
//                    });
//                    leftButton2.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//                            x -= 50;
//                            //drawPlayerOne(x, y);
//                        }
//                    });
//                    rightButton2.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//                            x += 50;
//                            //drawPlayerOne(x, y);
//
//                        }
//                    });
//                }
//            });
//
//
//            WallButton2.addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    AButton2.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//
//                        }
//                    });
//                    bButton2.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//
//                        }
//                    });
//                    cButton2.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//
//                        }
//                    });
//                    dButton2.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//
//                        }
//
//
//                    });
//                    eButton2.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//
//                        }
//                    });
//                    fButton2.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//
//                        }
//                    });
//                    gButton2.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//
//                        }
//                    });
//                    hButton2.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//
//                        }
//                    });
//                    iButton2.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//
//                        }
//                    });
//                    if (columnPressed == true) {
//                        row1Button2.addActionListener(new ActionListener() {
//                            @Override
//                            public void actionPerformed(ActionEvent e) {
//
//                            }
//                        });
//                        row2Button2.addActionListener(new ActionListener() {
//                            @Override
//                            public void actionPerformed(ActionEvent e) {
//
//                            }
//                        });
//                        row3Button2.addActionListener(new ActionListener() {
//                            @Override
//                            public void actionPerformed(ActionEvent e) {
//
//                            }
//                        });
//                        row4Button2.addActionListener(new ActionListener() {
//                            @Override
//                            public void actionPerformed(ActionEvent e) {
//
//                            }
//                        });
//                        row5Button2.addActionListener(new ActionListener() {
//                            @Override
//                            public void actionPerformed(ActionEvent e) {
//
//                            }
//                        });
//                        row6Button2.addActionListener(new ActionListener() {
//                            @Override
//                            public void actionPerformed(ActionEvent e) {
//
//                            }
//                        });
//                        row7Button2.addActionListener(new ActionListener() {
//                            @Override
//                            public void actionPerformed(ActionEvent e) {
//
//                            }
//                        });
//                        row8Button2.addActionListener(new ActionListener() {
//                            @Override
//                            public void actionPerformed(ActionEvent e) {
//
//                            }
//                        });
//                        row9Button2.addActionListener(new ActionListener() {
//                            @Override
//                            public void actionPerformed(ActionEvent e) {
//
//                            }
//                        });
//                    }
//                    if (RowPressed == true) {
//                        northButton2.addActionListener(new ActionListener() {
//                            @Override
//                            public void actionPerformed(ActionEvent e) {
//
//                            }
//                        });
//                        southButton2.addActionListener(new ActionListener() {
//                            @Override
//                            public void actionPerformed(ActionEvent e) {
//
//                            }
//                        });
//                        eastButton2.addActionListener(new ActionListener() {
//                            @Override
//                            public void actionPerformed(ActionEvent e) {
//
//                            }
//                        });
//                        westButton2.addActionListener(new ActionListener() {
//                            @Override
//                            public void actionPerformed(ActionEvent e) {
//
//                            }
//                        });
//
//
//                    }
//                }
//            });
//
//
//        }
//        else if (turnStatus==3) {
//            movePlayerButton3.addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//
//                    upButton3.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//                            player3Y-=deltaY;
//                            //drawPlayerOne(x, y);
//
//
//                        }
//                    });
//
//                    downButton3.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//                            player3Y+=deltaY;
//                            //drawPlayerOne(x, y);
//                        }
//                    });
//                    leftButton3.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//                            player2X-=deltaX;
//                            //drawPlayerOne(x, y);
//                        }
//                    });
//                    rightButton3.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//                            player3X+=deltaX;
//                            //drawPlayerOne(x, y);
//
//                        }
//                    });
//                }
//            });
//
//
//            placeWallButton3.addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    columnAButton3.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//
//                        }
//                    });
//                    bButton3.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//
//                        }
//                    });
//                    cButton3.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//
//                        }
//                    });
//                    dButton3.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//
//                        }
//
//
//                    });
//                    eButton3.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//
//                        }
//                    });
//                    fButton3.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//
//                        }
//                    });
//                    gButton3.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//
//                        }
//                    });
//                    hButton3.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//
//                        }
//                    });
//                    iButton3.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//
//                        }
//                    });
//                    if (columnPressed == true) {
//                        row1Button3.addActionListener(new ActionListener() {
//                            @Override
//                            public void actionPerformed(ActionEvent e) {
//
//                            }
//                        });
//                        row2Button3.addActionListener(new ActionListener() {
//                            @Override
//                            public void actionPerformed(ActionEvent e) {
//
//                            }
//                        });
//                        row3Button3.addActionListener(new ActionListener() {
//                            @Override
//                            public void actionPerformed(ActionEvent e) {
//
//                            }
//                        });
//                        row4Button3.addActionListener(new ActionListener() {
//                            @Override
//                            public void actionPerformed(ActionEvent e) {
//
//                            }
//                        });
//                        row5Button3.addActionListener(new ActionListener() {
//                            @Override
//                            public void actionPerformed(ActionEvent e) {
//
//                            }
//                        });
//                        row6Button3.addActionListener(new ActionListener() {
//                            @Override
//                            public void actionPerformed(ActionEvent e) {
//
//                            }
//                        });
//                        row7Button3.addActionListener(new ActionListener() {
//                            @Override
//                            public void actionPerformed(ActionEvent e) {
//
//                            }
//                        });
//                        row8Button3.addActionListener(new ActionListener() {
//                            @Override
//                            public void actionPerformed(ActionEvent e) {
//
//                            }
//                        });
//                        row9Button3.addActionListener(new ActionListener() {
//                            @Override
//                            public void actionPerformed(ActionEvent e) {
//
//                            }
//                        });
//                    }
//                    if (RowPressed == true) {
//                        northButton3.addActionListener(new ActionListener() {
//                            @Override
//                            public void actionPerformed(ActionEvent e) {
//
//                            }
//                        });
//                        southButton3.addActionListener(new ActionListener() {
//                            @Override
//                            public void actionPerformed(ActionEvent e) {
//
//                            }
//                        });
//                        eastButton3.addActionListener(new ActionListener() {
//                            @Override
//                            public void actionPerformed(ActionEvent e) {
//
//                            }
//                        });
//                        westButton3.addActionListener(new ActionListener() {
//                            @Override
//                            public void actionPerformed(ActionEvent e) {
//
//                            }
//                        });
//
//
//                    }
//                }
//            });
//        }
//        else if (turnStatus==4){
//        movePlayerButton4.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//                upButton4.addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//                        player4Y-=deltaY;
//                        //drawPlayerOne(x, y);
//
//
//                    }
//                });
//
//                downButton4.addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//                        player4Y+=deltaY;
//                        //drawPlayerOne(x, y);
//                    }
//                });
//                leftButton4.addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//                        player4X-=deltaX;
//                        //drawPlayerOne(x, y);
//                    }
//                });
//                rightButton4.addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//                        player4X+=deltaX;
//                        //drawPlayerOne(x, y);
//
//                    }
//                });
//            }
//        });
//
//
//        placeWallButton4.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                columnAButton4.addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//
//                    }
//                });
//                bButton4.addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//
//                    }
//                });
//                cButton4.addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//
//                    }
//                });
//                dButton4.addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//
//                    }
//
//
//                });
//                eButton4.addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//
//                    }
//                });
//                fButton4.addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//
//                    }
//                });
//                gButton4.addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//
//                    }
//                });
//                hButton4.addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//
//                    }
//                });
//                iButton4.addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//
//                    }
//                });
//                if (columnPressed == true) {
//                    row1Button4.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//
//                        }
//                    });
//                    row2Button4.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//
//                        }
//                    });
//                    row3Button4.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//
//                        }
//                    });
//                    row4Button4.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//
//                        }
//                    });
//                    row5Button4.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//
//                        }
//                    });
//                    row6Button4.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//
//                        }
//                    });
//                    row7Buttton4.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//
//                        }
//                    });
//                    row8Button4.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//
//                        }
//                    });
//                    row9Button4.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//
//                        }
//                    });
//                }
//                if (RowPressed == true) {
//                    northButton4.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//
//                        }
//                    });
//                    southButton4.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//
//                        }
//                    });
//                    eastButton4.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//
//                        }
//                    });
//                    westButton4.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//
//                        }
//                    });
//
//
//                }
//            }
//        });
//
//
//    }


    }







    }


