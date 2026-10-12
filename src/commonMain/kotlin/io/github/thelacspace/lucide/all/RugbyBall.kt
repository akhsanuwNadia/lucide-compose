package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RugbyBall") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,10.0f)
                lineTo(14.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,7.0f)
                lineTo(17.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.34f,2.138f)
                curveTo(8.403121f,2.9298513f,2.9298513f,8.403121f,2.138f,15.34f)
                curveTo(1.781f,18.28f,2.142f,20.259f,2.943f,21.057f)
                curveTo(3.7410002f,21.856998f,5.721f,22.219f,8.661f,21.862f)
                curveTo(15.597159f,21.069807f,21.069807f,15.597159f,21.862f,8.661f)
                curveTo(22.219f,5.721f,21.858f,3.7410002f,21.057f,2.9430003f)
                curveTo(20.258999f,2.1430004f,18.279f,1.7810004f,15.339999f,2.1380002f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,7.0f)
                lineTo(7.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,13.0f)
                lineTo(11.0f,17.0f)
            }
}

public val LucideIcons.All.RugbyBallDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RugbyBall: ImageVector
    @Composable get() = RugbyBallDefinition.asImageVector()
