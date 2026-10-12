package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Beef") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.4f,13.7f)
                curveTo(18.651615f,12.007866f,19.557228f,9.058117f,18.64303f,6.3940353f)
                curveTo(17.728832f,3.7299535f,15.202858f,1.9577775f,12.386675f,2.0046942f)
                curveTo(9.570492f,2.0516112f,7.10495f,3.9069445f,6.28f,6.6f)
                curveTo(5.1800003f,9.73f,5.5f,10.5f,3.1000001f,12.68f)
                curveTo(2.1201034f,13.483346f,1.7505984f,14.8157215f,2.1767728f,16.00901f)
                curveTo(2.6029475f,17.2023f,3.7328925f,17.999155f,5.0f,18.0f)
                curveTo(9.0f,18.0f,13.4f,16.2f,16.4f,13.7f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.5f,6.0f)
                lineTo(20.254f,9.5f)
                curveTo(21.733505f,12.31775f,20.947802f,15.792815f,18.4f,17.7f)
                curveTo(15.4f,20.2f,11.0f,22.0f,7.0f,22.0f)
                curveTo(5.864501f,21.998447f,4.827189f,21.355934f,4.3199997f,20.34f)
                lineTo(2.4f,16.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,8.5f)
                curveTo(9.995994f,9.395827f,10.471613f,10.225326f,11.246761f,10.674399f)
                curveTo(12.02191f,11.123474f,12.97809f,11.123474f,13.753239f,10.674399f)
                curveTo(14.528387f,10.225326f,15.004006f,9.395827f,15.0f,8.5f)
                curveTo(15.004006f,7.6041727f,14.528387f,6.7746744f,13.753239f,6.3256f)
                curveTo(12.97809f,5.876526f,12.02191f,5.876526f,11.246761f,6.3256f)
                curveTo(10.471613f,6.7746744f,9.995994f,7.6041727f,10.0f,8.5f)
            }
}

public val LucideIcons.All.BeefDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Beef: ImageVector
    @Composable get() = BeefDefinition.asImageVector()
