package Participants.JeanmonodRoulin;

import Othello.*;

class Joueur extends Othello.Joueur
{
	public Joueur(){
		super();
	}
	
	public Joueur(int depth, int playerID)
	{
	  this.depth = depth;
	  this.playerID = playerID;
	}
	public Move nextPlay(Move move)
	{
	    return null;
	}	
}