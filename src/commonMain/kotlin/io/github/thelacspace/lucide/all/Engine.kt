package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Engine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,3.0f)
                lineTo(16.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,3.0f)
                lineTo(13.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,10.0f)
                lineTo(2.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,13.0f)
                lineTo(6.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,16.0f)
                curveTo(6.0f,17.10457f,6.8954306f,18.0f,8.0f,18.0f)
                lineTo(9.0f,18.0f)
                curveTo(9.629515f,18.0f,10.222291f,18.296389f,10.6f,18.8f)
                lineTo(10.900001f,19.199999f)
                curveTo(11.27771f,19.70361f,11.870486f,19.999998f,12.500001f,19.999998f)
                lineTo(14.764001f,19.999998f)
                curveTo(15.521693f,19.999973f,16.214314f,19.57178f,16.553001f,18.893997f)
                lineTo(18.223001f,15.552998f)
                curveTo(18.392426f,15.213946f,18.738976f,14.999822f,19.118002f,14.999998f)
                lineTo(21.0f,14.999998f)
                curveTo(21.552284f,14.999998f,22.0f,14.552283f,22.0f,13.999998f)
                lineTo(22.0f,9.999998f)
                curveTo(22.0f,9.447713f,21.552284f,8.999998f,21.0f,8.999998f)
                lineTo(17.5f,8.999998f)
                curveTo(17.185244f,8.999998f,16.888855f,8.851804f,16.7f,8.599998f)
                lineTo(15.800001f,7.3999987f)
                curveTo(15.611146f,7.148193f,15.314757f,6.9999995f,15.0f,7.0f)
                lineTo(11.0f,7.0f)
                curveTo(10.685243f,7.0f,10.388854f,7.1481943f,10.2f,7.4f)
                lineTo(9.3f,8.6f)
                curveTo(9.111146f,8.851806f,8.814757f,9.0f,8.5f,9.0f)
                lineTo(7.0f,9.0f)
                curveTo(6.4477153f,9.0f,6.0f,9.447715f,6.0f,10.0f)
                close()
            }
}

public val LucideIcons.All.EngineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Engine: ImageVector
    @Composable get() = EngineDefinition.asImageVector()
