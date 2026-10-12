package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Salad") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.496f,12.0f)
                curveTo(19.972296f,11.366911f,20.120321f,10.545532f,19.895f,9.786f)
                curveTo(20.488186f,9.4876375f,20.89462f,8.91433f,20.97979f,8.255819f)
                curveTo(21.06496f,7.5973086f,20.817759f,6.939461f,20.32f,6.5f)
                curveTo(20.943449f,5.9501715f,21.1618f,5.072025f,20.868464f,4.2942367f)
                curveTo(20.575127f,3.516449f,19.831264f,3.0011945f,19.0f,3.0f)
                curveTo(18.425545f,3.0007274f,17.879139f,3.2484314f,17.5f,3.68f)
                curveTo(17.060719f,3.1817193f,16.402704f,2.9340563f,15.743895f,3.0190382f)
                curveTo(15.085084f,3.10402f,14.511457f,3.5105562f,14.213f,4.104f)
                curveTo(13.513338f,3.8962052f,12.757807f,4.004542f,12.144728f,4.400573f)
                curveTo(11.531649f,4.7966037f,11.122252f,5.4407763f,11.024f,6.164f)
                curveTo(9.639075f,6.6417475f,8.801758f,8.049897f,9.043407f,9.494843f)
                curveTo(9.285057f,10.939787f,10.534988f,11.99887f,12.0f,12.0f)
                lineTo(16.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,12.0f)
                curveTo(3.711787f,12.000321f,3.437727f,12.12498f,3.2480865f,12.342012f)
                curveTo(3.058446f,12.559046f,2.9716673f,12.847347f,3.01f,13.133f)
                curveTo(3.5834498f,17.652819f,7.4440556f,21.03117f,12.0f,21.0f)
                curveTo(16.555944f,21.03117f,20.41655f,17.652819f,20.99f,13.132999f)
                curveTo(21.028332f,12.847347f,20.941553f,12.559045f,20.751913f,12.342012f)
                curveTo(20.562273f,12.12498f,20.288214f,12.000321f,20.0f,12.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,21.0f)
                lineTo(17.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.85f,6.907f)
                curveTo(8.437057f,5.6299706f,6.2623563f,5.717105f,4.956112f,7.1030846f)
                curveTo(3.649867f,8.489064f,3.6915884f,10.66511f,5.05f,12.0f)
            }
}

public val LucideIcons.All.SaladDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Salad: ImageVector
    @Composable get() = SaladDefinition.asImageVector()
