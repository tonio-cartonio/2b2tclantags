package me.tigermouthbear.clantags.data;

import java.util.ArrayList;

/***
 * @author Tigermouthbear
 * 12/30/19
 */

public class Clan
{
	private static ArrayList<Clan> clans = new ArrayList<>();

	private ArrayList<ClanMember> members = new ArrayList<>();
	private String abbreviation;
	private String fullName;
	private String description;
	private String color;
	private String discord;

	public String allies = "NONE";
	public String enemies = "NONE";

	public Clan(String abbreviation, String fullName, String description, String color, String discord)
	{
		this.abbreviation = abbreviation;
		this.fullName = fullName;
		this.description = description;
		this.color = color;
		this.discord = discord;

		clans.add(this);
	}

	public void addMember(ClanMember member)
	{
		members.add(member);
		member.getClans().add(this);
	}

	public ArrayList<ClanMember> getMembers()
	{
		return members;
	}

	public String getAbbreviation()
	{
		return abbreviation;
	}

	public String getFullName()
	{
		return fullName;
	}

	public String getDescription()
	{
		return description;
	}

	public String getColor()
	{
		return color;
	}

	public String getDiscord()
	{
		return discord;
	}

	public static ArrayList<Clan> getAllClans()
	{
		return clans;
	}

	public static Clan getClan(String nameOrAbbreviation)
	{
		for(Clan clan: clans)
		{
			if(clan.abbreviation.equalsIgnoreCase(nameOrAbbreviation) || clan.fullName.equalsIgnoreCase(nameOrAbbreviation)) return clan;
		}

		return null;
	}
}