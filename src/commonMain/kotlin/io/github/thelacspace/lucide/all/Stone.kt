package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Stone") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.264f,2.205f)
                curveTo(9.375107f,1.5747434f,7.310273f,2.4298337f,6.42f,4.211f)
                lineTo(2.42f,12.211f)
                curveTo(1.5178899f,14.015331f,2.100507f,16.209042f,3.779f,17.328001f)
                lineTo(9.779f,21.328001f)
                curveTo(11.122689f,22.22391f,12.873312f,22.22391f,14.217001f,21.328001f)
                lineTo(20.217001f,17.328001f)
                curveTo(21.717382f,16.327585f,22.362835f,14.446925f,21.793001f,12.736001f)
                lineTo(19.793001f,6.736001f)
                curveTo(19.39487f,5.541473f,18.45753f,4.6041303f,17.263f,4.2060013f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(11.99f,22.0f)
                lineTo(14.0f,12.0f)
                lineTo(21.822f,15.184f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,12.0f)
                lineTo(8.47f,2.302f)
            }
}

public val LucideIcons.All.StoneDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Stone: ImageVector
    @Composable get() = StoneDefinition.asImageVector()
