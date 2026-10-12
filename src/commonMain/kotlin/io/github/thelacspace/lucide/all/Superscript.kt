package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Superscript") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,19.0f)
                lineTo(12.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,19.0f)
                lineTo(4.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,12.0f)
                lineTo(16.0f,12.0f)
                curveTo(16.0f,10.5f,16.442f,10.0f,17.5f,9.5f)
                curveTo(18.558f,9.0f,20.0f,8.334f,20.0f,7.002f)
                curveTo(20.0f,6.5299997f,19.83f,6.072f,19.516f,5.712f)
                curveTo(18.856556f,4.9660463f,17.76467f,4.7841344f,16.899f,5.276f)
                curveTo(16.479f,5.515f,16.161f,5.89f,16.0f,6.336f)
            }
}

public val LucideIcons.All.SuperscriptDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Superscript: ImageVector
    @Composable get() = SuperscriptDefinition.asImageVector()
