package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PhilippinePeso") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.0f,11.0f)
                lineTo(4.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,7.0f)
                lineTo(4.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,21.0f)
                lineTo(7.0f,4.0f)
                curveTo(7.0f,3.4477153f,7.4477153f,3.0f,8.0f,3.0f)
                lineTo(12.0f,3.0f)
                curveTo(15.303234f,3.0147727f,17.973227f,5.6967325f,17.973227f,9.0f)
                curveTo(17.973227f,12.3032675f,15.303234f,14.985228f,12.0f,15.0f)
                lineTo(7.0f,15.0f)
            }
}

public val LucideIcons.All.PhilippinePesoDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PhilippinePeso: ImageVector
    @Composable get() = PhilippinePesoDefinition.asImageVector()
