package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BrickWallFire") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,3.0f)
                lineTo(16.0f,5.1070004f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,9.0f)
                curveTo(18.0f,12.0f,19.5f,12.5f,20.5f,13.5f)
                curveTo(21.442072f,14.423152f,21.981215f,15.681153f,22.0f,17.0f)
                curveTo(21.98769f,19.752695f,19.752724f,21.97769f,17.0f,21.97769f)
                curveTo(14.247277f,21.97769f,12.01231f,19.752695f,12.0f,17.0f)
                curveTo(12.0f,16.7f,12.0f,16.4f,12.1f,16.1f)
                curveTo(12.331644f,16.910666f,13.046788f,17.489004f,13.887975f,17.545938f)
                curveTo(14.729162f,17.602873f,15.515715f,17.126175f,15.854482f,16.354116f)
                curveTo(16.193249f,15.582058f,16.011469f,14.6804695f,15.400001f,14.1f)
                curveTo(13.0f,11.5f,16.0f,9.0f,17.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,8.274f)
                lineTo(21.0f,5.0f)
                curveTo(21.0f,3.8954306f,20.10457f,3.0f,19.0f,3.0f)
                lineTo(5.0f,3.0f)
                curveTo(3.8954306f,3.0f,3.0f,3.8954306f,3.0f,5.0f)
                lineTo(3.0f,19.0f)
                curveTo(3.0f,20.10457f,3.8954306f,21.0f,5.0f,21.0f)
                lineTo(8.938f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,15.0f)
                lineTo(8.253f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,9.0f)
                lineTo(11.228f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,15.0f)
                lineTo(8.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,3.0f)
                lineTo(8.0f,9.0f)
            }
}

public val LucideIcons.All.BrickWallFireDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BrickWallFire: ImageVector
    @Composable get() = BrickWallFireDefinition.asImageVector()
