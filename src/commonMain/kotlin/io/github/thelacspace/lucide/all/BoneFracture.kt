package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BoneFracture") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0f,4.5f)
                curveTo(14.006155f,3.1236522f,15.123638f,2.0111554f,16.5f,2.0111554f)
                curveTo(17.876362f,2.0111554f,18.993845f,3.1236522f,19.0f,4.5f)
                curveTo(19.0f,4.7761426f,19.223858f,5.0f,19.5f,5.0f)
                curveTo(20.876348f,5.006155f,21.988844f,6.1236386f,21.988844f,7.5f)
                curveTo(21.988844f,8.876362f,20.876348f,9.993845f,19.5f,10.0f)
                curveTo(18.69f,10.0f,17.7f,9.3f,17.0f,10.0f)
                lineTo(15.042f,11.957f)
                curveTo(15.00348f,11.995434f,14.9471655f,12.009993f,14.894845f,11.995044f)
                curveTo(14.842524f,11.980095f,14.802402f,11.9379835f,14.79f,11.885f)
                lineTo(14.297f,9.815001f)
                curveTo(14.28419f,9.759662f,14.241221f,9.716306f,14.186f,9.703f)
                lineTo(12.114f,9.209f)
                curveTo(12.061017f,9.196598f,12.018906f,9.156476f,12.003957f,9.104155f)
                curveTo(11.989008f,9.051834f,12.003567f,8.99552f,12.042001f,8.957f)
                lineTo(14.0f,7.0f)
                curveTo(14.7f,6.3f,14.0f,5.31f,14.0f,4.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,20.0f)
                lineTo(15.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,16.0f)
                lineTo(18.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,8.0f)
                lineTo(6.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,4.0f)
                lineTo(9.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.698f,14.19f)
                curveTo(9.710973f,14.245607f,9.754393f,14.289027f,9.81f,14.302f)
                lineTo(11.884001f,14.791f)
                curveTo(11.936984f,14.803402f,11.979095f,14.843524f,11.994044f,14.895845f)
                curveTo(12.008993f,14.948166f,11.994434f,15.00448f,11.956f,15.043f)
                lineTo(10.0f,17.0f)
                curveTo(9.3f,17.7f,10.0f,18.69f,10.0f,19.5f)
                curveTo(9.993845f,20.876348f,8.876362f,21.988844f,7.5f,21.988844f)
                curveTo(6.1236386f,21.988844f,5.006155f,20.876348f,5.0f,19.5f)
                curveTo(5.0013504f,19.366982f,4.9491057f,19.23902f,4.8550434f,19.144957f)
                curveTo(4.7609806f,19.050894f,4.6330175f,18.99865f,4.5f,19.0f)
                curveTo(3.1236522f,18.993845f,2.0111554f,17.876362f,2.0111554f,16.5f)
                curveTo(2.0111554f,15.123638f,3.1236522f,14.006155f,4.5f,14.0f)
                curveTo(5.31f,14.0f,6.3f,14.7f,7.0f,14.0f)
                lineTo(8.956f,12.043f)
                curveTo(8.99452f,12.004566f,9.050835f,11.990007f,9.103155f,12.004956f)
                curveTo(9.155477f,12.019905f,9.195599f,12.0620165f,9.208f,12.115f)
                close()
            }
}

public val LucideIcons.All.BoneFractureDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BoneFracture: ImageVector
    @Composable get() = BoneFractureDefinition.asImageVector()
