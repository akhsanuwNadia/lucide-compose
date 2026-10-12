package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ThumbsUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,5.88f)
                lineTo(14.0f,10.0f)
                lineTo(19.83f,10.0f)
                curveTo(20.459515f,10.0f,21.052292f,10.296389f,21.43f,10.8f)
                curveTo(21.807709f,11.303612f,21.926264f,11.955666f,21.75f,12.559999f)
                lineTo(19.42f,20.56f)
                curveTo(19.171112f,21.413334f,18.38889f,22.0f,17.5f,22.0f)
                lineTo(4.0f,22.0f)
                curveTo(2.8954306f,22.0f,2.0f,21.10457f,2.0f,20.0f)
                lineTo(2.0f,12.0f)
                curveTo(2.0f,10.895431f,2.8954306f,10.0f,4.0f,10.0f)
                lineTo(6.76f,10.0f)
                curveTo(7.5189443f,9.999598f,8.21227f,9.569658f,8.55f,8.89f)
                lineTo(12.0f,2.0f)
                curveTo(12.955355f,2.0118303f,13.852988f,2.4593587f,14.437405f,3.215203f)
                curveTo(15.02182f,3.9710474f,15.22901f,4.9524245f,15.0f,5.88f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,10.0f)
                lineTo(7.0f,22.0f)
            }
}

public val LucideIcons.All.ThumbsUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ThumbsUp: ImageVector
    @Composable get() = ThumbsUpDefinition.asImageVector()
