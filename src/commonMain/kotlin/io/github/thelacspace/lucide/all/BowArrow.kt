package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BowArrow") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0f,3.0f)
                lineTo(21.0f,3.0f)
                lineTo(21.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.575f,11.082f)
                curveTo(19.998924f,13.8669405f,20.37101f,17.071907f,19.623001f,20.109001f)
                curveTo(19.525684f,20.507725f,19.22656f,20.826302f,18.83475f,20.948513f)
                curveTo(18.44294f,21.070723f,18.015741f,20.978695f,17.709002f,20.706001f)
                lineTo(14.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,10.0f)
                lineTo(3.29f,6.29f)
                curveTo(3.019337f,5.982808f,2.9289384f,5.5564833f,3.0516403f,5.1658816f)
                curveTo(3.1743424f,4.7752805f,3.4922926f,4.4772325f,3.8899999f,4.38f)
                curveTo(6.928275f,3.6318579f,10.134454f,4.0046697f,12.92f,5.4300003f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,14.0f)
                curveTo(6.5471287f,13.999244f,6.112674f,14.179217f,5.793f,14.5f)
                lineTo(3.1470003f,17.146f)
                curveTo(3.003753f,17.288885f,2.9607365f,17.504017f,3.0380254f,17.691f)
                curveTo(3.1153145f,17.877983f,3.2976732f,17.999956f,3.5f,18.0f)
                lineTo(5.0f,18.0f)
                curveTo(5.5522847f,18.0f,6.0f,18.447716f,6.0f,19.0f)
                lineTo(6.0f,20.5f)
                curveTo(5.9996376f,20.702509f,6.121463f,20.885239f,6.3085365f,20.962784f)
                curveTo(6.4956107f,21.04033f,6.7109857f,20.997377f,6.854f,20.854f)
                lineTo(9.5f,18.207f)
                curveTo(9.820784f,17.887327f,10.000756f,17.452871f,10.0f,17.0f)
                lineTo(10.0f,15.0f)
                curveTo(10.0f,14.447715f,9.552285f,14.0f,9.0f,14.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.707f,14.293f)
                lineTo(21.0f,3.0f)
            }
}

public val LucideIcons.All.BowArrowDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BowArrow: ImageVector
    @Composable get() = BowArrowDefinition.asImageVector()
