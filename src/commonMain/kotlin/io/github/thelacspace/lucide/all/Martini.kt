package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Martini") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,12.0f)
                lineTo(4.207f,4.207f)
                curveTo(4.0047355f,4.0047965f,3.9442182f,3.70065f,4.0536747f,3.4364223f)
                curveTo(4.163131f,3.1721947f,4.420998f,2.999939f,4.707f,3.0f)
                lineTo(19.293f,3.0f)
                curveTo(19.579f,2.999939f,19.836868f,3.1721947f,19.946325f,3.4364223f)
                curveTo(20.05578f,3.70065f,19.995264f,4.0047965f,19.793f,4.207f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,12.0f)
                lineTo(12.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,22.0f)
                lineTo(17.0f,22.0f)
            }
}

public val LucideIcons.All.MartiniDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Martini: ImageVector
    @Composable get() = MartiniDefinition.asImageVector()
