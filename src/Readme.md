===================================Main==================================
Name: Birthday Presents
Author: Peter Max Dreyer

Desc:  A plugin that gives presents to players if it is their birthday.
================================Technical================================

Internal Storage Format:
	
	The internal storage format is used by the plugin if 
SQLite(Not implemented) as well as MySQL (also not implemented)
are not configured.  It is laid out as follows:

Size	Name		Desc

byte	NameLength	The length of the user's name in bytes.
byte[]	Name		A nmumber of bytes (up to 16)
					storing the user's username.
byte	Day			The day of the month the user was born.
byte	Month		The month the user was born.
short	Year		The year the player was born
