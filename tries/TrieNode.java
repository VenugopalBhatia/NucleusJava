package tries;

import java.util.HashMap;

public class TrieNode {
boolean isTerminal;
char Letter;
HashMap<Character,TrieNode> children;
public TrieNode(char Letter){
	this.Letter=Letter;
	children=new HashMap<>();
}
}
