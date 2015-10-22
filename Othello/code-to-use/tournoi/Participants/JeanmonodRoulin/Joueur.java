package Participants.JeanmonodRoulin;

import Othello.*;
import java.lang.Math;
import java.util.ArrayList;

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
		Node origin = new Node();
		int v = alphaBeta(origin, depth, -1234124124, 1241241212, true);
	    return null;
	}
	private int alphaBeta(Node node, int d, int alpha, int beta, boolean player)
	{
		if (d == 0 || !node.hasChildren())
		{
			return node.getValue();
		}
		if(player)
		{
			int v = -Integer.MAX_VALUE;
			for(Node child: node.getChildren())
			{
				v = Math.max(v, alphaBeta(child, depth - 1, alpha, beta, false));
				alpha = Math.max(alpha, v);
				if (beta >= alpha)
					break;
			}
			return v;
		}
		else
		{
			int v = Integer.MAX_VALUE;
			for(Node child: node.getChildren())
			{
				v = Math.min(v, alphaBeta(child, depth - 1, alpha, beta, true));
				beta = Math.min(beta, v);
				if (beta <= alpha)
					break;
			}
			return v;
		}
	}
}