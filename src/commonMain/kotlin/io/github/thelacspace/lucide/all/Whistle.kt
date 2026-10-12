package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Whistle") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,6.0f)
                lineTo(10.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,6.0f)
                curveTo(21.552284f,6.0f,22.0f,6.4477153f,22.0f,7.0f)
                lineTo(22.0f,9.0f)
                curveTo(22.0f,9.552285f,21.552284f,10.0f,21.0f,10.0f)
                lineTo(15.325f,10.0f)
                curveTo(16.660341f,12.815146f,15.974241f,16.174011f,13.641859f,18.239967f)
                curveTo(11.309477f,20.305925f,7.8923564f,20.581577f,5.258975f,18.916199f)
                curveTo(2.6255934f,17.250818f,1.4099635f,14.045363f,2.2767901f,11.052572f)
                curveTo(3.143617f,8.059781f,5.8842034f,6.000198f,9.0f,6.0f)
                close()
            }
}

public val LucideIcons.All.WhistleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Whistle: ImageVector
    @Composable get() = WhistleDefinition.asImageVector()
