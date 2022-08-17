package com.net.classicartmeetscompose.icons.selected

import androidx.compose.ui.graphics.vector.ImageVector
import com.net.classicartmeetscompose.icons.selected.myiconpack.*
import kotlin.collections.List as ____KtList

public object SelectedIcons

private var __AllIcons: ____KtList<ImageVector>? = null

public val SelectedIcons.AllIcons: ____KtList<ImageVector>
    get() {
        if (__AllIcons != null) {
            return __AllIcons!!
        }
        __AllIcons = listOf(
            Bell,
            Bookmark, Calendar, Camera, Clock, Comment, Comments,
            Compass, Copy, Coupon, Desktop, Discount, Download, Envelope,
            Eye, File, Film, Filter, Flag, Folder, Globe, Headphones,
            Heart, Home, Image, Inbox, Link, Lock, Map, Menu, Microphone, Mobile,
            Package, Paperclip, Pen, Phone, Search, Send, Settings, Shield,
            Star, Stopwatch, Store, Tablet, Tag, Thumbtack,
            Trash, Unlock, Upload, User, Users, Video,
        )
        return __AllIcons!!
    }
