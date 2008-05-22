// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   JMFAppProps.java

package com.sun.media.util.locale;

import java.util.ListResourceBundle;

public class JMFAppProps extends ListResourceBundle
{

    public JMFAppProps()
    {
    }

    public Object[][] getContents()
    {
        return contents;
    }

    static final Object contents[][] = {
        {
            "jmstudio.appname", "JMStudio"
        }, {
            "jmstudio.unknown", "<unknown>"
        }, {
            "jmstudio.snapshot", "Snap Shot"
        }, {
            "jmstudio.rtpsession", "RTP Session"
        }, {
            "jmstudio.menu.file", "File"
        }, {
            "jmstudio.menu.file.newwindow", "New Window"
        }, {
            "jmstudio.menu.file.openfile", "Open File..."
        }, {
            "jmstudio.menu.file.openurl", "Open URL..."
        }, {
            "jmstudio.menu.file.openrtp", "Open RTP Session..."
        }, {
            "jmstudio.menu.file.capture", "Capture..."
        }, {
            "jmstudio.menu.file.recent", "Recent URLs"
        }, {
            "jmstudio.menu.file.close", "Close"
        }, {
            "jmstudio.menu.file.saveas", "Save As..."
        }, {
            "jmstudio.menu.file.export", "Export..."
        }, {
            "jmstudio.menu.file.transmit", "Transmit..."
        }, {
            "jmstudio.menu.file.preferences", "Preferences..."
        }, {
            "jmstudio.menu.file.exit", "Exit"
        }, {
            "jmstudio.menu.player", "Player"
        }, {
            "jmstudio.menu.player.autoplay", "Auto Play"
        }, {
            "jmstudio.menu.player.autoloop", "Auto Loop"
        }, {
            "jmstudio.menu.player.keepaspect", "Maintain Aspect Ratio"
        }, {
            "jmstudio.menu.player.fullscreen", "Full Screen"
        }, {
            "jmstudio.menu.player.snapshot", "Snap Shot"
        }, {
            "jmstudio.menu.player.plugins", "PlugIn Viewer"
        }, {
            "jmstudio.menu.player.capturecontrols", "Capture Control"
        }, {
            "jmstudio.menu.player.rtpsession", "RTP Session Control"
        }, {
            "jmstudio.menu.player.transmission", "Transmission Statistics"
        }, {
            "jmstudio.menu.help", "Help"
        }, {
            "jmstudio.menu.help.about", "About JM Studio..."
        }, {
            "jmstudio.menu.stats", "Statistics"
        }, {
            "jmstudio.playerwindow.transcoding", "Transcoding Processor"
        }, {
            "jmstudio.playerwindow.preview", "Preview Player"
        }, {
            "jmstudio.about.title", "About JMStudio ..."
        }, {
            "jmstudio.about.version", "JMF Version"
        }, {
            "jmstudio.about.copyright", "Copyright (C) 1998-2003 Sun Microsystems, Inc."
        }, {
            "jmstudio.about.rights", "All rights reserved."
        }, {
            "jmstudio.openurl.title", "Open URL"
        }, {
            "jmstudio.openurl.label", "URL:"
        }, {
            "jmstudio.openrtp.title", "Open RTP Session"
        }, {
            "jmstudio.openrtp.label.address", "Address:"
        }, {
            "jmstudio.openrtp.label.port", "Port:"
        }, {
            "jmstudio.openrtp.label.ttl", "TTL:"
        }, {
            "jmstudio.capture.title", "Select Capture Device"
        }, {
            "jmstudio.capture.nodevices", "No capture devices found in JMF registry!"
        }, {
            "jmstudio.capture.video.usedevice", "Use video device"
        }, {
            "jmstudio.capture.audio.usedevice", "Use audio device"
        }, {
            "jmstudio.capturecontrols.title", "Capture Device Controls"
        }, {
            "jmstudio.capturecontrols.close", "Close"
        }, {
            "jmstudio.export.title", "Export"
        }, {
            "jmstudio.export.source.label1", "Type in the source location of the Media"
        }, {
            "jmstudio.export.source.label2", "to be used for export."
        }, {
            "jmstudio.export.source.file", "File..."
        }, {
            "jmstudio.export.source.capture", "Capture..."
        }, {
            "jmstudio.export.source.filedialog", "Select source file"
        }, {
            "jmstudio.export.format.label1", "Specify the content type and parameters for output."
        }, {
            "jmstudio.export.format.label2", ""
        }, {
            "jmstudio.export.format.format", "Format:"
        }, {
            "jmstudio.export.format.audio", "Audio"
        }, {
            "jmstudio.export.format.video", "Video"
        }, {
            "jmstudio.export.format.hinted", "(hinted)"
        }, {
            "jmstudio.export.type.label1", "Select the type of the export operation."
        }, {
            "jmstudio.export.type.label2", ""
        }, {
            "jmstudio.export.type.file", "Save to a file"
        }, {
            "jmstudio.export.type.network", "Transmit over the network"
        }, {
            "jmstudio.export.type.screen", "Preview on screen"
        }, {
            "jmstudio.export.type.other", "Other"
        }, {
            "jmstudio.export.targetfile.label1", "Specify the name of the file to store Media to."
        }, {
            "jmstudio.export.targetfile.label2", ""
        }, {
            "jmstudio.export.targetfile.browse", "Browse..."
        }, {
            "jmstudio.export.targetfile.filedialog", "Select target file"
        }, {
            "jmstudio.export.targetnw.label1", "Enter the Session Address and Port Number for each track"
        }, {
            "jmstudio.export.targetnw.label2", "to export. (e.g. address: 224.123.111.101 & port: 22224)"
        }, {
            "jmstudio.export.targetnw.track", "Track:"
        }, {
            "jmstudio.export.targetnw.sessionaddr", "Session Address:"
        }, {
            "jmstudio.export.targetnw.port", "Port:"
        }, {
            "jmstudio.export.targetnw.ttl", "TTL:"
        }, {
            "jmstudio.export.targetnw.audio", "Audio"
        }, {
            "jmstudio.export.targetnw.video", "Video"
        }, {
            "jmstudio.transmit.title", "RTP Transmit"
        }, {
            "jmstudio.transmitstats.title", "Overall RTP Transmission Statistics"
        }, {
            "jmstudio.transmitstats.totalrtppacketssent", "Total RTP Packets Sent:"
        }, {
            "jmstudio.transmitstats.totalbytessent", "Total Bytes Sent:"
        }, {
            "jmstudio.transmitstats.rtcppacketssent", "RTCP Packets Sent:"
        }, {
            "jmstudio.transmitstats.localcollisions", "Local Collisions:"
        }, {
            "jmstudio.transmitstats.remotecollisions", "Remote Collisions:"
        }, {
            "jmstudio.transmitstats.failedtransmissions", "Failed Transmissions:"
        }, {
            "jmstudio.rtpsessionctrl.title", "RTP Session Control"
        }, {
            "jmstudio.rtpsessionctrl.panel.overall", "Overall RTP Statistics"
        }, {
            "jmstudio.rtpsessionctrl.panel.participants", "Participants"
        }, {
            "jmstudio.rtpsessionctrl.panel.bufferctrl", "Buffer Control"
        }, {
            "jmstudio.rtpsessionctrl.overall.totalpackets", "Total Packets Received:"
        }, {
            "jmstudio.rtpsessionctrl.overall.totalbytes", "Total Bytes Received:"
        }, {
            "jmstudio.rtpsessionctrl.overall.badrtppackets", "Bad RTP Packets:"
        }, {
            "jmstudio.rtpsessionctrl.overall.localcollisions", "Local Collisions:"
        }, {
            "jmstudio.rtpsessionctrl.overall.remotecollisions", "Remote Collisions:"
        }, {
            "jmstudio.rtpsessionctrl.overall.packetslooped", "Packets Looped:"
        }, {
            "jmstudio.rtpsessionctrl.overall.failedtransmissions", "Failed Transmissions:"
        }, {
            "jmstudio.rtpsessionctrl.overall.rtcppackets", "RTCP Packets Received:"
        }, {
            "jmstudio.rtpsessionctrl.overall.srpackets", "SR Packets Received:"
        }, {
            "jmstudio.rtpsessionctrl.overall.badrtcppackets", "Bad RTCP Packets Received:"
        }, {
            "jmstudio.rtpsessionctrl.overall.unknownrtcptypes", "Unknown RTCP Types:"
        }, {
            "jmstudio.rtpsessionctrl.overall.malformedrr", "Malformed RR:"
        }, {
            "jmstudio.rtpsessionctrl.overall.malformedsdes", "Malformed SDES:"
        }, {
            "jmstudio.rtpsessionctrl.overall.malformedbye", "Malformed BYE:"
        }, {
            "jmstudio.rtpsessionctrl.overall.malformedsr", "Malformed SR:"
        }, {
            "jmstudio.rtpsessionctrl.partcipants", "Participants"
        }, {
            "jmstudio.rtpsessionctrl.partcipants.remotereceivestream", "Remote Receive Stream"
        }, {
            "jmstudio.rtpsessionctrl.partcipants.unknownstream", "Unknown Stream"
        }, {
            "jmstudio.rtpsessionctrl.partcipants.report", "Report"
        }, {
            "jmstudio.rtpsessionctrl.partcipants.latestsenderreport", "Latest Sender Report"
        }, {
            "jmstudio.rtpsessionctrl.partcipants.reportblock", "Report Block"
        }, {
            "jmstudio.rtpsessionctrl.partcipants.reportblockbyme", "Report Block sent by me for this SSRC"
        }, {
            "jmstudio.rtpsessionctrl.partcipants.senderreportblock", "Sender Report Block"
        }, {
            "jmstudio.rtpsessionctrl.partcipants.none", "<none>"
        }, {
            "jmstudio.rtpsessionctrl.partcipants.remote", "Remote"
        }, {
            "jmstudio.rtpsessionctrl.partcipants.local", "Local"
        }, {
            "jmstudio.rtpsessionctrl.partcipants.passive", "Passive"
        }, {
            "jmstudio.rtpsessionctrl.partcipants.active", "Active"
        }, {
            "jmstudio.rtpsessionctrl.srcdescr.cname", "CNAME:"
        }, {
            "jmstudio.rtpsessionctrl.srcdescr.name", "Name:"
        }, {
            "jmstudio.rtpsessionctrl.srcdescr.email", "E-mail:"
        }, {
            "jmstudio.rtpsessionctrl.srcdescr.phone", "Phone:"
        }, {
            "jmstudio.rtpsessionctrl.srcdescr.location", "Location:"
        }, {
            "jmstudio.rtpsessionctrl.srcdescr.tool", "Tool:"
        }, {
            "jmstudio.rtpsessionctrl.srcdescr.note", "Note:"
        }, {
            "jmstudio.rtpsessionctrl.srcdescr.private", "Private:"
        }, {
            "jmstudio.rtpsessionctrl.srcdescr.none", "<none>"
        }, {
            "jmstudio.rtpsessionctrl.stream.owner", "Owner Participant:"
        }, {
            "jmstudio.rtpsessionctrl.stream.ssrc", "SSRC:"
        }, {
            "jmstudio.rtpsessionctrl.stream.lostpdu", "Lost PDU::"
        }, {
            "jmstudio.rtpsessionctrl.stream.processedpdu", "Processed PDU:"
        }, {
            "jmstudio.rtpsessionctrl.stream.misorderedpdu", "Misordered PDU:"
        }, {
            "jmstudio.rtpsessionctrl.stream.invalidpdu", "Invalid PDU:"
        }, {
            "jmstudio.rtpsessionctrl.stream.duplicatepdu", "Duplicate PDU:"
        }, {
            "jmstudio.rtpsessionctrl.report.ssrc", "SSRC of Report Sender:"
        }, {
            "jmstudio.rtpsessionctrl.report.ntptimestamplsw", "NTP Timestamp LSW (secs.):"
        }, {
            "jmstudio.rtpsessionctrl.report.ntptimestampmsw", "NTP Timestamp MSW (secs.):"
        }, {
            "jmstudio.rtpsessionctrl.report.rtptimestamp", "RTP Timestamp (RTPtime):"
        }, {
            "jmstudio.rtpsessionctrl.report.bytecount", "Sender Byte Count:"
        }, {
            "jmstudio.rtpsessionctrl.report.packetcount", "Sender Packet Count:"
        }, {
            "jmstudio.rtpsessionctrl.feedback.dlsr", "DLSR (secs.):"
        }, {
            "jmstudio.rtpsessionctrl.feedback.fractionlost", "Fraction Lost:"
        }, {
            "jmstudio.rtpsessionctrl.feedback.lostpackets", "Lost Packets:"
        }, {
            "jmstudio.rtpsessionctrl.feedback.jitter", "Jitter (RTPtime):"
        }, {
            "jmstudio.rtpsessionctrl.feedback.lsr", "LSR (NTPtime):"
        }, {
            "jmstudio.rtpsessionctrl.feedback.ssrc", "SSRC:"
        }, {
            "jmstudio.rtpsessionctrl.feedback.xtndseqnum", "Extended Sequence Number:"
        }, {
            "jmstudio.dlg.ok", "OK"
        }, {
            "jmstudio.dlg.cancel", "Cancel"
        }, {
            "jmstudio.dlg.close", "Close"
        }, {
            "jmstudio.dlg.open", "Open"
        }, {
            "jmstudio.dlg.save", "Save..."
        }, {
            "jmstudio.dlg.yes", "Yes"
        }, {
            "jmstudio.dlg.no", "No"
        }, {
            "jmstudio.wizard.finish", "Finish"
        }, {
            "jmstudio.wizard.cancel", "Cancel"
        }, {
            "jmstudio.wizard.next", "Next >>"
        }, {
            "jmstudio.wizard.back", "<< Back"
        }, {
            "jmstudio.saveas.title", "Export..."
        }, {
            "jmstudio.saveas.type.msvideo", "MSVideo (avi)"
        }, {
            "jmstudio.saveas.type.quicktime", "QuickTime (mov)"
        }, {
            "jmstudio.saveas.type.aiff", "AIFF (aif)"
        }, {
            "jmstudio.saveas.type.gsm", "GSM (gsm)"
        }, {
            "jmstudio.saveas.type.wave", "Wave (wav)"
        }, {
            "jmstudio.saveas.type.basicaudio", "Basic Audio (au)"
        }, {
            "jmstudio.saveas.type.mpegaudio", "MPEG Audio (mp2/mp3)"
        }, {
            "jmstudio.saveas.audio", "Audio"
        }, {
            "jmstudio.saveas.video", "Video"
        }, {
            "jmstudio.saveas.save", "Save..."
        }, {
            "jmstudio.saveas.cancel", "Cancel"
        }, {
            "jmstudio.saveas.format", "Format:"
        }, {
            "jmstudio.saveas.filedialog", "Save As File ..."
        }, {
            "jmstudio.saveprogress.title", "Saving File ..."
        }, {
            "jmstudio.saveprogress.label", "Saving File, please wait ..."
        }, {
            "jmstudio.saveprogress.abort", " Abort "
        }, {
            "jmstudio.saveprogress.stop", " Stop "
        }, {
            "jmstudio.saveprogress.pause", " Pause "
        }, {
            "jmstudio.saveprogress.resume", "Resume"
        }, {
            "jmstudio.saveprogress.saved", "Saved"
        }, {
            "jmstudio.saveprogress.seconds", "seconds"
        }, {
            "jmstudio.messagedlg.error", "Error"
        }, {
            "jmstudio.messagedlg.exception", "Exception"
        }, {
            "jmstudio.messagedlg.warning", "Warning"
        }, {
            "jmstudio.messagedlg.query", "Query"
        }, {
            "jmstudio.error.processor.create", "Failed to create Processor."
        }, {
            "jmstudio.error.processor.configure", "Failed to configure Processor."
        }, {
            "jmstudio.error.processor.realize", "Failed to realize Processor."
        }, {
            "jmstudio.error.processor.creatednooutput", "Processor created no output."
        }, {
            "jmstudio.error.processor.outputincorrect", "Processor output incorrect for transmission."
        }, {
            "jmstudio.error.processor.outputempty", "Processor output empty."
        }, {
            "jmstudio.error.processor.createsessionmanager", "Unable to create Session Manager."
        }, {
            "jmstudio.error.processor.transmittracks", "Couldn't transmit any track."
        }, {
            "jmstudio.error.processor.filesizelimit", "Reached file size limit."
        }, {
            "jmstudio.error.processor.writefile", "Error writing the file."
        }, {
            "jmstudio.error.processor.savefile", "Failed to save file."
        }, {
            "jmstudio.error.player.create", "Error creating player."
        }, {
            "jmstudio.error.player.createfor", "Could not create player for"
        }, {
            "jmstudio.error.datasource.create", "Failed to create Data Source."
        }, {
            "jmstudio.error.datasource.createfor", "Failed to create Data Source for"
        }, {
            "jmstudio.error.rtprec.timeout", "Can not detect any data from sender, timeout."
        }, {
            "jmstudio.error.rtprec.wait7", "Wait for data from sender, 7 secs has elasped"
        }, {
            "jmstudio.error.rtprec.wait16", "Wait for data from sender, 16 secs has elasped"
        }, {
            "jmstudio.error.rtprec.wait25", "Wait for data from sender, 25 secs has elasped"
        }, {
            "jmstudio.error.sessionaddr", "Invalid session address."
        }, {
            "jmstudio.error.port", "Invalid port number. Value shoud be even."
        }, {
            "jmstudio.error.audio.sessionaddr", "Invalid session address for Audio"
        }, {
            "jmstudio.error.audio.port", "Invalid port number for Audio"
        }, {
            "jmstudio.error.video.sessionaddr", "Invalid session address for Video"
        }, {
            "jmstudio.error.video.port", "Invalid port number for Video"
        }, {
            "jmstudio.error.controller", "Controller Error:"
        }, {
            "jmstudio.error.buildurlfor", "Can't build URL for"
        }, {
            "jmstudio.error.capturequery", "Capture device query unsuccesful!"
        }, {
            "jmstudio.error.captureds", "Couldn't initialize the Capture Device!"
        }, {
            "jmstudio.error.openrtp.nostreams", "RTP session contains no streams."
        }, {
            "jmstudio.error.sessionmngr.create", "Failed to create Session Manager."
        }, {
            "jmstudio.error.cfgfile.create", "Error creating configuration file. Configuration data will not be saved for the next run."
        }, {
            "jmstudio.error.cfgfile.close", "Error closing configuration file."
        }, {
            "jmstudio.error.cfgfile.read", "Error reading configuration file. Application will not use configuration data from the previous run."
        }, {
            "jmstudio.error.cfgfile.write", "Error writing configuration file. Configuration data will not be saved for the next run."
        }, {
            "jmstudio.query.erooropencapture.closepreview", "Cannot open a capture device twice. Should I close the preview?"
        }, {
            "jmstudio.query.savertp.unicast", "Cannot use the same RTP address. Would you like to close the RTP session?"
        }, {
            "jmstudio.mssg.capturequery", "Querying capture devices..."
        }, {
            "jmstudio.mssg.lookingcapture", "is looking for Audio and Video Capture devices. This might take a few minutes."
        }, {
            "jmstudio.mssg.lookingvideocapture", "is looking for Video Capture devices. This might take a few minutes."
        }, {
            "jmfregistry.appname", "JMF Registry"
        }, {
            "jmfregistry.title", "JMF Registry Editor"
        }, {
            "jmfregistry.package", "Packages"
        }, {
            "jmfregistry.plugins", "PlugIns"
        }, {
            "jmfregistry.capture", "Capture Devices"
        }, {
            "jmfregistry.mimetypes", "Mime Types"
        }, {
            "jmfregistry.settings", "User Settings"
        }, {
            "jmfregistry.capture.vector.label", "Capture Devices"
        }, {
            "jmfregistry.capture.detect", "Detect Capture Devices"
        }, {
            "jmfregistry.protocolprefix.vector.label", "Protocol Prefix List"
        }, {
            "jmfregistry.contentprefix.vector.label", "Content Prefix List"
        }, {
            "jmfregistry.capture.details.label", "Capture Device  Details"
        }, {
            "jmfregistry.plugin.details.label", "PlugIn Details"
        }, {
            "jmfregistry.details.name", "Name"
        }, {
            "jmfregistry.details.locator", "Locator"
        }, {
            "jmfregistry.details.informats", "Input Formats"
        }, {
            "jmfregistry.details.outformats", "Output Formats"
        }, {
            "jmfregistry.plugin", "PlugIn"
        }, {
            "jmfregistry.plugin.demultiplexer", "Demultiplexer"
        }, {
            "jmfregistry.plugin.codec", "Codec"
        }, {
            "jmfregistry.plugin.effect", "Effect"
        }, {
            "jmfregistry.plugin.renderer", "Renderer"
        }, {
            "jmfregistry.plugin.multiplexer", "Multiplexer"
        }, {
            "jmfregistry.mime.type.label", "MIME type:"
        }, {
            "jmfregistry.mime.ext.label", "Extension:"
        }, {
            "jmfregistry.settings.allowfilewrite", "Allow File Writing for Applets"
        }, {
            "jmfregistry.settings.allowcapture", "Allow Capture for Applets"
        }, {
            "jmfregistry.settings.allowcaching", "Allow Caching"
        }, {
            "jmfregistry.settings.cachedirectory", "Cache Directory:"
        }, {
            "jmfregistry.settings.maxcache", "Max Cache Size (MB):"
        }, {
            "jmfregistry.settings.allowlogging", "Allow Logging"
        }, {
            "jmfregistry.settings.loggingdirectory", "Logging Directory:"
        }, {
            "jmfregistry.settings.commit", "Commit"
        }, {
            "jmfregistry.settings.restore", "Restore"
        }, {
            "jmfregistry.vector.add", "Add"
        }, {
            "jmfregistry.vector.moveup", "Move Up"
        }, {
            "jmfregistry.vector.movedown", "Move Down"
        }, {
            "jmfregistry.vector.remove", "Remove"
        }, {
            "jmfregistry.vector.restore", "Restore"
        }, {
            "jmfregistry.vector.commit", "Commit"
        }, {
            "jmfregistry.error.cachesize", "Invalid Cache Size"
        }, {
            "jmfregistry.error.commit", "Could not commit"
        }, {
            "jmfregistry.error.additem", "Could not add item"
        }, {
            "jmfregistry.error.removeitem", "Could not remove item"
        }
    };

}