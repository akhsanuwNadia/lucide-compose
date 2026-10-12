package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TubeLotion") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,18.0f)
                lineTo(15.0f,21.0f)
                curveTo(15.0f,21.552284f,14.552285f,22.0f,14.0f,22.0f)
                lineTo(10.0f,22.0f)
                curveTo(9.447715f,22.0f,9.0f,21.552284f,9.0f,21.0f)
                lineTo(9.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,2.0f)
                curveTo(17.757544f,1.9999999f,18.450071f,2.4280045f,18.788855f,3.1055727f)
                curveTo(19.127638f,3.7831407f,19.054527f,4.5939646f,18.6f,5.2f)
                curveTo(17.561422f,6.5847692f,17.0f,8.269038f,17.0f,10.0f)
                lineTo(17.0f,16.0f)
                curveTo(17.0f,17.10457f,16.10457f,18.0f,15.0f,18.0f)
                lineTo(9.0f,18.0f)
                curveTo(7.8954306f,18.0f,7.0f,17.10457f,7.0f,16.0f)
                lineTo(7.0f,10.0f)
                curveTo(7.0f,8.269038f,6.438577f,6.5847692f,5.4f,5.2f)
                curveTo(4.9454737f,4.5939646f,4.8723617f,3.783141f,5.211146f,3.1055727f)
                curveTo(5.5499296f,2.4280047f,6.242456f,2.0f,7.0f,2.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,10.0f)
                curveTo(8.599328f,9.329983f,10.400672f,9.329983f,12.0f,10.0f)
                curveTo(13.599328f,10.670017f,15.400672f,10.670017f,17.0f,10.0f)
            }
}

public val LucideIcons.All.TubeLotionDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TubeLotion: ImageVector
    @Composable get() = TubeLotionDefinition.asImageVector()
