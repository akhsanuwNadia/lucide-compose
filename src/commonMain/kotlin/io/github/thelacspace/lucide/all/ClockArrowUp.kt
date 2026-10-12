package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClockArrowUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,6.0f)
                lineTo(12.0f,12.0f)
                lineTo(13.559999f,12.78f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.227f,21.925f)
                curveTo(9.071018f,22.438965f,5.0349445f,20.308979f,3.1139271f,16.587952f)
                curveTo(1.1929096f,12.866925f,1.7938508f,8.343033f,4.6196885f,5.2525644f)
                curveTo(7.4455256f,2.1620965f,11.897701f,1.1596645f,15.775375f,2.7407997f)
                curveTo(19.653051f,4.3219347f,22.13487f,8.151727f,21.994f,12.336999f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,18.0f)
                lineTo(18.0f,14.0f)
                lineTo(22.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,22.0f)
                lineTo(18.0f,14.0f)
            }
}

public val LucideIcons.All.ClockArrowUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClockArrowUp: ImageVector
    @Composable get() = ClockArrowUpDefinition.asImageVector()
