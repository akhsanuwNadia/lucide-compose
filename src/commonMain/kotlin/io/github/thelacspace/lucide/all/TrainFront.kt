package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TrainFront") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0f,3.1f)
                lineTo(8.0f,7.0f)
                curveTo(8.009849f,9.202156f,9.797822f,10.982151f,12.0f,10.982151f)
                curveTo(14.202178f,10.982151f,15.990151f,9.202156f,16.0f,7.0f)
                lineTo(16.0f,3.1f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,15.0f)
                lineTo(8.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,15.0f)
                lineTo(16.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,19.0f)
                curveTo(6.2f,19.0f,4.0f,16.8f,4.0f,14.0f)
                lineTo(4.0f,10.0f)
                curveTo(4.0196967f,5.5956874f,7.595643f,2.0356972f,12.0f,2.0356972f)
                curveTo(16.404356f,2.0356972f,19.980303f,5.5956874f,20.0f,10.0f)
                lineTo(20.0f,14.0f)
                curveTo(20.0f,16.8f,17.8f,19.0f,15.0f,19.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,19.0f)
                lineTo(6.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,19.0f)
                lineTo(18.0f,22.0f)
            }
}

public val LucideIcons.All.TrainFrontDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TrainFront: ImageVector
    @Composable get() = TrainFrontDefinition.asImageVector()
