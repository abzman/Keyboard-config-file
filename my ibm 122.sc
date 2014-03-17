#abzman m-122
remapblock
	F13		ESC
	F14		PRINTSCREEN
	F15		PAUSE
	F18		MEDIA_PREV_TRACK
	F19		MEDIA_PLAY_PAUSE
	F20		MEDIA_STOP
	F21		MEDIA_NEXT_TRACK
	F22		MEDIA_MUTE
	F23		MEDIA_VOLUME_DOWN
	F24		MEDIA_VOLUME_UP
	EXTRA_F1	MEDIA_WWW_FORWARD
	EUROPE_1	BACKSLASH
	EUROPE_2	LGUI
	LANG_4		DOWN
	DOWN		APP
	NUM_LOCK	PAD_SLASH
	EXTRA_SYSRQ	PAD_MINUS
	PAD_MINUS	PAD_ENTER
	AUX1		RIGHT
	AUX2		LEFT
	AUX3		SPACE
	AUX4		PAGE_UP
	AUX5		PAGE_DOWN
endblock

macroblock 
	macro F17	#paste
		PUSH_META ASSIGN_META LCTRL
		PRESS P
		POP_META
	endmacro

	macro PAD_ASTERIX	#carrot
		PUSH_META ASSIGN_META LSHIFT
		PRESS 6
		POP_META
	endmacro

	macro SCROLL_LOCK	#pad asterisk fix
		PUSH_META ASSIGN_META LSHIFT
		PRESS 8
		POP_META
	endmacro

	macro F16	#select all
		PUSH_META ASSIGN_META LCTRL
		PRESS A
		POP_META
	endmacro

	macro EXTRA_F9  #next tab
		MAKE LCTRL
		PRESS TAB
		BREAK LCTRL
	endmacro

	macro EXTRA_F2	#redo
		PUSH_META ASSIGN_META LCTRL
		PRESS Y
		POP_META
	endmacro

	macro EXTRA_F3	#untab
		MAKE LSHIFT
		PRESS TAB
		BREAK LSHIFT
	endmacro

	macro EXTRA_F4	#undo
		PUSH_META ASSIGN_META LCTRL
		PRESS Z
		POP_META
	endmacro

	macro EXTRA_F5	#new tab
		MAKE LCTRL
		PRESS T
		BREAK LCTRL
	endmacro

	macro EXTRA_F6	#copy
		PUSH_META ASSIGN_META LCTRL
		PRESS C
		POP_META
	endmacro

	macro EXTRA_F7	#kill tab
		MAKE LCTRL
		PRESS W
		BREAK LCTRL
	endmacro

	macro EXTRA_F8	#paste
		PUSH_META ASSIGN_META LCTRL
		PRESS V
		POP_META
	endmacro

	macro EXTRA_F10	#cut
		PUSH_META ASSIGN_META LCTRL
		PRESS X
		POP_META
	endmacro

	macro MEDIA_WWW_FORWARD SHIFT
		PUSH_META CLEAR_META ALL    # save and clear all metas
		PRESS MEDIA_WWW_BACK
		POP_ALL_META                # restore metas that were active before
	endmacro
endblock
