package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("EggOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,14.347f)
                lineTo(20.0f,14.0f)
                curveTo(20.0f,8.0f,16.0f,2.0f,12.0f,2.0f)
                curveTo(10.922f,2.0f,9.843f,2.4359999f,8.843f,3.19f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.206f,6.21f)
                curveTo(4.871f,8.4f,4.0f,11.2f,4.0f,14.0f)
                curveTo(3.999748f,17.496431f,6.2701406f,20.587969f,9.606401f,21.6341f)
                curveTo(12.942662f,22.680231f,16.57179f,21.43857f,18.568f,18.568f)
            }
}

public val LucideIcons.All.EggOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.EggOff: ImageVector
    @Composable get() = EggOffDefinition.asImageVector()
