package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Park") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,18.0f)
                lineTo(22.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.248f,9.998f)
                curveTo(12.862815f,9.423006f,12.350194f,8.944606f,11.75f,8.6f)
                lineTo(11.75f,8.0f)
                curveTo(11.7407675f,5.935478f,10.064542f,4.266733f,8.0f,4.266733f)
                curveTo(5.9354577f,4.266733f,4.259233f,5.935478f,4.25f,8.0f)
                curveTo(2.4876738f,9.137459f,1.644781f,11.270476f,2.1535053f,13.305374f)
                curveTo(2.6622295f,15.340271f,4.4097314f,16.82569f,6.5f,17.0f)
                lineTo(8.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,14.0f)
                lineTo(13.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,14.0f)
                lineTo(21.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,14.0f)
                lineTo(13.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,20.0f)
                lineTo(8.0f,14.078f)
                curveTo(7.999887f,13.54761f,7.7890987f,13.038985f,7.414f,12.664f)
                lineTo(6.5f,11.75f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.205f,12.795f)
                lineTo(8.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,6.0f)
                curveTo(16.996796f,6.716662f,17.37729f,7.3802605f,17.99741f,7.7395196f)
                curveTo(18.617527f,8.098779f,19.382473f,8.098779f,20.00259f,7.7395196f)
                curveTo(20.62271f,7.3802605f,21.003204f,6.716662f,21.0f,6.0f)
                curveTo(21.003204f,5.283338f,20.62271f,4.6197395f,20.00259f,4.2604804f)
                curveTo(19.382473f,3.9012208f,18.617527f,3.9012208f,17.99741f,4.2604804f)
                curveTo(17.37729f,4.6197395f,16.996796f,5.283338f,17.0f,6.0f)
            }
}

public val LucideIcons.All.ParkDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Park: ImageVector
    @Composable get() = ParkDefinition.asImageVector()
