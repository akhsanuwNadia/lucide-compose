package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UserGroup") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0f,21.0f)
                lineTo(17.0f,20.0f)
                curveTo(17.0f,18.89543f,16.10457f,18.0f,15.0f,18.0f)
                lineTo(9.0f,18.0f)
                curveTo(7.8954306f,18.0f,7.0f,18.89543f,7.0f,20.0f)
                lineTo(7.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,10.0f)
                lineTo(20.0f,10.0f)
                curveTo(21.10457f,10.0f,22.0f,10.895431f,22.0f,12.0f)
                lineTo(22.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,10.0f)
                lineTo(4.0f,10.0f)
                curveTo(2.8954306f,10.0f,2.0f,10.895431f,2.0f,12.0f)
                lineTo(2.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,11.0f)
                curveTo(8.995193f,12.074993f,9.565935f,13.070391f,10.496114f,13.60928f)
                curveTo(11.426291f,14.148169f,12.573709f,14.148169f,13.503886f,13.60928f)
                curveTo(14.434065f,13.070391f,15.004807f,12.074993f,15.0f,11.0f)
                curveTo(15.004807f,9.925007f,14.434065f,8.929609f,13.503886f,8.39072f)
                curveTo(12.573709f,7.8518314f,11.426291f,7.8518314f,10.496114f,8.39072f)
                curveTo(9.565935f,8.929609f,8.995193f,9.925007f,9.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,4.0f)
                curveTo(15.996795f,4.716662f,16.37729f,5.3802605f,16.99741f,5.7395196f)
                curveTo(17.617527f,6.098779f,18.382473f,6.098779f,19.00259f,5.7395196f)
                curveTo(19.62271f,5.3802605f,20.003204f,4.716662f,20.0f,4.0f)
                curveTo(20.003204f,3.283338f,19.62271f,2.6197395f,19.00259f,2.2604802f)
                curveTo(18.382473f,1.9012209f,17.617527f,1.9012209f,16.99741f,2.2604802f)
                curveTo(16.37729f,2.6197395f,15.996795f,3.283338f,16.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,4.0f)
                curveTo(3.996795f,4.716662f,4.3772902f,5.3802605f,4.9974093f,5.7395196f)
                curveTo(5.617528f,6.098779f,6.382472f,6.098779f,7.0025907f,5.7395196f)
                curveTo(7.6227098f,5.3802605f,8.003205f,4.716662f,8.0f,4.0f)
                curveTo(8.003205f,3.283338f,7.6227098f,2.6197395f,7.0025907f,2.2604802f)
                curveTo(6.382472f,1.9012209f,5.617528f,1.9012209f,4.9974093f,2.2604802f)
                curveTo(4.3772902f,2.6197395f,3.996795f,3.283338f,4.0f,4.0f)
            }
}

public val LucideIcons.All.UserGroupDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UserGroup: ImageVector
    @Composable get() = UserGroupDefinition.asImageVector()
