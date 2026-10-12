package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MessagesSquare") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,10.0f)
                curveTo(16.0f,11.104569f,15.104569f,12.0f,14.0f,12.0f)
                lineTo(6.828f,12.0f)
                curveTo(6.2976103f,12.0001135f,5.7889853f,12.210901f,5.414f,12.586f)
                lineTo(3.2120001f,14.788f)
                curveTo(3.008943f,14.99102f,2.7035918f,15.051747f,2.4383073f,14.941868f)
                curveTo(2.1730225f,14.831989f,2.000037f,14.57314f,2.0f,14.286f)
                lineTo(2.0f,4.0f)
                curveTo(2.0f,2.8954306f,2.8954306f,2.0f,4.0f,2.0f)
                lineTo(14.0f,2.0f)
                curveTo(15.104569f,2.0f,16.0f,2.8954306f,16.0f,4.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,9.0f)
                curveTo(21.10457f,9.0f,22.0f,9.895431f,22.0f,11.0f)
                lineTo(22.0f,21.286f)
                curveTo(21.999964f,21.57314f,21.826979f,21.83199f,21.561693f,21.941868f)
                curveTo(21.296408f,22.051746f,20.991056f,21.99102f,20.788f,21.788f)
                lineTo(18.586f,19.586f)
                curveTo(18.211016f,19.210901f,17.70239f,19.000114f,17.172f,19.0f)
                lineTo(10.0f,19.0f)
                curveTo(8.895431f,19.0f,8.0f,18.10457f,8.0f,17.0f)
                lineTo(8.0f,16.0f)
            }
}

public val LucideIcons.All.MessagesSquareDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MessagesSquare: ImageVector
    @Composable get() = MessagesSquareDefinition.asImageVector()
