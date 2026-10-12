package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Paperclip") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,6.0f)
                lineTo(7.5860004f,14.586f)
                curveTo(6.8107452f,15.36822f,6.8135667f,16.629944f,7.5923123f,17.40869f)
                curveTo(8.3710575f,18.187435f,9.632781f,18.190256f,10.415001f,17.415f)
                lineTo(18.829f,8.829f)
                curveTo(19.847073f,7.819994f,20.247452f,6.3433843f,19.87853f,4.958299f)
                curveTo(19.509611f,3.5732136f,18.427788f,2.4913912f,17.042702f,2.1224706f)
                curveTo(15.657617f,1.75355f,14.181007f,2.1539288f,13.172001f,3.1720004f)
                lineTo(4.793001f,11.723f)
                curveTo(3.2566638f,13.234521f,2.649047f,15.45392f,3.2012103f,17.537222f)
                curveTo(3.7533736f,19.620523f,5.380477f,21.247627f,7.4637785f,21.799791f)
                curveTo(9.54708f,22.351954f,11.7664795f,21.744337f,13.278001f,20.208f)
                lineTo(21.657001f,11.657001f)
            }
}

public val LucideIcons.All.PaperclipDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Paperclip: ImageVector
    @Composable get() = PaperclipDefinition.asImageVector()
