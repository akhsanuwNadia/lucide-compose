package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareStar") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.035f,7.69f)
                curveTo(11.170602f,7.2740417f,11.560857f,6.9945245f,11.998325f,7.0000243f)
                curveTo(12.435794f,7.005524f,12.818898f,7.2947645f,12.944f,7.714f)
                lineTo(13.681f,9.166f)
                curveTo(13.826493f,9.452342f,14.100671f,9.651372f,14.417999f,9.701f)
                lineTo(16.052f,9.957f)
                curveTo(16.483564f,9.958686f,16.865358f,10.237041f,16.998966f,10.647407f)
                curveTo(17.132572f,11.057771f,16.987846f,11.507553f,16.64f,11.763f)
                lineTo(15.467999f,12.931f)
                curveTo(15.240374f,13.157624f,15.135463f,13.479796f,15.186f,13.797f)
                lineTo(15.445f,15.41f)
                curveTo(15.591288f,15.8250675f,15.449022f,16.286983f,15.094562f,16.547825f)
                curveTo(14.740102f,16.808668f,14.256777f,16.807116f,13.903999f,16.544f)
                lineTo(12.438999f,15.794001f)
                curveTo(12.152696f,15.647307f,11.813303f,15.647307f,11.526999f,15.794001f)
                lineTo(10.061999f,16.544f)
                curveTo(9.7093f,16.80489f,9.227744f,16.805437f,8.8744545f,16.545347f)
                curveTo(8.521165f,16.28526f,8.378648f,15.8252735f,8.522999f,15.411f)
                lineTo(8.780999f,13.798f)
                curveTo(8.831536f,13.480797f,8.726625f,13.158625f,8.499f,12.932f)
                lineTo(7.3429995f,11.779f)
                curveTo(6.9831023f,11.529663f,6.8272533f,11.075198f,6.958395f,10.657471f)
                curveTo(7.089537f,10.239742f,7.4771714f,9.955899f,7.9149995f,9.957001f)
                lineTo(9.547999f,9.701001f)
                curveTo(9.865328f,9.651373f,10.139505f,9.452343f,10.285f,9.166001f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,3.0f)
                lineTo(19.0f,3.0f)
                lineTo(21.0f,3.0f)
                lineTo(21.0f,21.0f)
                lineTo(19.0f,21.0f)
                lineTo(5.0f,21.0f)
                lineTo(3.0f,21.0f)
                lineTo(3.0f,3.0f)
                lineTo(5.0f,3.0f)
                close()
            }
}

public val LucideIcons.All.SquareStarDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareStar: ImageVector
    @Composable get() = SquareStarDefinition.asImageVector()
