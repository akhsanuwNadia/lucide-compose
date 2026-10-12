package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("VenetianMask") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0,11.0)
                curveTo(16.5,11.0,15.5,11.5,15.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,6.0)
                curveTo(2.895430564880371,6.0,2.0,6.895430564880371,2.0,8.0)
                lineTo(2.0,12.0)
                curveTo(2.0,14.76142406463623,4.238576412200928,17.0,7.0,17.0)
                curveTo(8.847710609436035,17.068824768066406,10.614537239074707,17.775554656982422,12.0,19.0)
                curveTo(13.385462760925293,17.775554656982422,15.152289390563965,17.068824768066406,17.0,17.0)
                curveTo(19.761423110961914,17.0,22.0,14.76142406463623,22.0,12.0)
                lineTo(22.0,8.0)
                curveTo(22.0,6.895430564880371,21.104570388793945,6.0,20.0,6.0)
                lineTo(17.0,6.0)
                curveTo(15.152289390563965,6.068824768066406,13.385462760925293,6.77555513381958,12.0,8.0)
                curveTo(10.614537239074707,6.77555513381958,8.847710609436035,6.068824768066406,7.0,6.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,11.0)
                curveTo(7.5,11.0,8.5,11.5,9.0,13.0)
            }
}

public val LucideIcons.All.VenetianMaskDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.VenetianMask: ImageVector
    @Composable get() = VenetianMaskDefinition.asImageVector()
