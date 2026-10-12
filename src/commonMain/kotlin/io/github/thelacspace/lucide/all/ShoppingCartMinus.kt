package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ShoppingCartMinus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,5.0f)
                lineTo(22.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.05f,2.05f)
                lineTo(3.149f,2.0219998f)
                curveTo(3.6394253f,2.0096362f,4.0663986f,2.3548577f,4.157f,2.837f)
                lineTo(6.847f,17.184f)
                curveTo(6.9355693f,17.657135f,7.3486466f,18.000036f,7.83f,18.0f)
                lineTo(18.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.564f,5.0f)
                lineTo(12.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.25f,14.0f)
                lineTo(18.962f,14.0f)
                curveTo(19.914991f,14.017963f,20.74824f,13.3609085f,20.953f,12.43f)
                lineTo(21.467f,9.317f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,20.0f)
                curveTo(15.996795f,20.716661f,16.37729f,21.38026f,16.99741f,21.73952f)
                curveTo(17.617527f,22.09878f,18.382473f,22.09878f,19.00259f,21.73952f)
                curveTo(19.62271f,21.38026f,20.003204f,20.716661f,20.0f,20.0f)
                curveTo(20.003204f,19.283339f,19.62271f,18.61974f,19.00259f,18.26048f)
                curveTo(18.382473f,17.90122f,17.617527f,17.90122f,16.99741f,18.26048f)
                curveTo(16.37729f,18.61974f,15.996795f,19.283339f,16.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,20.0f)
                curveTo(5.996795f,20.716661f,6.3772902f,21.38026f,6.9974093f,21.73952f)
                curveTo(7.617528f,22.09878f,8.382472f,22.09878f,9.002591f,21.73952f)
                curveTo(9.622709f,21.38026f,10.003205f,20.716661f,10.0f,20.0f)
                curveTo(10.003205f,19.283339f,9.622709f,18.61974f,9.002591f,18.26048f)
                curveTo(8.382472f,17.90122f,7.617528f,17.90122f,6.9974093f,18.26048f)
                curveTo(6.3772902f,18.61974f,5.996795f,19.283339f,6.0f,20.0f)
            }
}

public val LucideIcons.All.ShoppingCartMinusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ShoppingCartMinus: ImageVector
    @Composable get() = ShoppingCartMinusDefinition.asImageVector()
